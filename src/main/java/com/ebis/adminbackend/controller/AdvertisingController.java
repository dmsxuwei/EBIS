package com.ebis.adminbackend.controller;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.ebis.adminbackend.common.FileUtil;
import com.ebis.adminbackend.common.GenerateID;
import com.ebis.adminbackend.exception.ResultBody;
import com.ebis.adminbackend.po.Advertising;
import com.ebis.adminbackend.service.AdvertisingService;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;

@Api(value = "advertising", tags = { "广告接口" })
@RequestMapping("advertising")
@RestController
public class AdvertisingController extends BaseController {

	private static final Logger log = LoggerFactory.getLogger(AdvertisingController.class);

	@Autowired
	private AdvertisingService advertisingService;


	
	/**
	 * 分页
	 * @param request
	 * @param page
	 * @param rows
	 * @param type
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getAdvertisingsForWeb", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody getAdvertisingsByPage(
			@RequestParam(name = "location") String location) throws Exception {
		
		List<Advertising> advertisings= advertisingService.selectlAdvertisingByLocation( location);
		return ResultBody.success(advertisings);
	}

	// =============================后台===================================================

	@RequestMapping(value = "/getAdvertisings", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getAdvertisings(HttpServletRequest request, @RequestParam(name = "page") String page,
			@RequestParam(name = "rows") String rows,@RequestParam(name = "type", required=false) String type) throws Exception {
		PageInfo<Advertising> pages = advertisingService.selectByExample(Integer.parseInt(page),
				Integer.parseInt(rows),type);
		List<Advertising> advertisings = pages.getList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", advertisings);
		map.put("total", pages.getTotal());
		return map;
	}

	/**
	 * 
	 * @Author David
	 * @CreateTime 2020年4月6日
	 * @Purpose【增加一条记录】 @param resources
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/addAdvertising", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody addMerchant(@RequestParam("file") MultipartFile file,
			@RequestParam(name = "companyid", required = false)String companyid,
			@RequestParam(name = "location", required = true) String location,
			@RequestParam(name = "rank", required = false) String rank,
			@RequestParam(name = "price", required = false) @Size(max = 200) String price,
			@RequestParam(name = "policy", required = false) @Size(max = 200) String policy,
			@RequestParam(name = "culture", required = false) @Size(max = 200) String culture) throws Exception {

	    
		Advertising advertising = new Advertising();
		if (!file.isEmpty()) {
			String returnfilename = FileUtil.writeFile(file, picture_path + "" + location + "/");
			advertising.setImage(location + "/" + returnfilename);
		}
		advertising.setAdvertisingid(GenerateID.getUUID());
		if (companyid != null && !"".equals(companyid))advertising.setCompanyid(companyid);
		
		advertising.setLocation(location);
		
		if (rank == null || "".equals(rank)) {
			advertising.setRank(0);
		} else {
			advertising.setRank(Integer.parseInt(rank));
		}
		
		if (price != null && !"".equals(price))advertising.setPrice((new Double(Double.parseDouble(price) * 100)).intValue()+"");
		if (policy != null && !"".equals(policy))advertising.setPolicy(policy);
		if (culture != null && !"".equals(culture))advertising.setCulture(culture);

		advertising.setCreatetime(new Date());

		int result = advertisingService.insertSelective(advertising); // 0 success 1 failed
		return ResultBody.success(result);
	}

	@RequestMapping(value = "/delAdvertising", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody delMerchant(@RequestParam(name = "advertisingid") String advertisingid) throws Exception {
		Advertising advertising = advertisingService.selectByPrimaryKey(advertisingid);
		int result = advertisingService.deleteByPrimaryKey(advertisingid);

		String rootpath = picture_path;
		String filePath = rootpath + advertising.getImage();
		System.out.println(filePath);
		File dest = new File(filePath);
		dest.delete();
		return ResultBody.success(result);
	}

}
