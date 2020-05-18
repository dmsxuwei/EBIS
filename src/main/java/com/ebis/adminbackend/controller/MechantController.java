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
import com.ebis.adminbackend.po.Merchant;
import com.ebis.adminbackend.service.MerchantService;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;

@Api(value = "merchant", tags = { "商家接口" })
@RequestMapping("merchant")
@RestController
public class MechantController extends BaseController {

	private static final Logger log = LoggerFactory.getLogger(MechantController.class);

	@Autowired
	private MerchantService merchantService;

	/**
	 * 首页用 不分页
	 * @param request
	 * @param type
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getMerchantsForweb_home", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody getMerchantsForweb(HttpServletRequest request, @RequestParam(name = "type") String type)
			throws Exception {
		log.info("" + type);
		List<Merchant> merchants = merchantService.selectAllCompanyinformation(type);
		return ResultBody.success(merchants);
	}
	
	/**
	 * 分页
	 * @param request
	 * @param page
	 * @param rows
	 * @param type
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getMerchantsByPage", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody getMerchantsByPage(HttpServletRequest request, 
			@RequestParam(name = "page") String page,
			@RequestParam(name = "rows") String rows,
			@RequestParam(name = "type") String type) throws Exception {
		PageInfo<Merchant> pages = merchantService.selectByExample(Integer.parseInt(page),
				Integer.parseInt(rows),type);
		List<Merchant> merchants = pages.getList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", merchants);
		map.put("total", pages.getTotal());
		return ResultBody.success(map);
	}

	// =============================后台===================================================

	@RequestMapping(value = "/getMerchants", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getMerchants(HttpServletRequest request, @RequestParam(name = "page") String page,
			@RequestParam(name = "rows") String rows,@RequestParam(name = "type", required=false) String type) throws Exception {
		PageInfo<Merchant> pages = merchantService.selectByExample(Integer.parseInt(page),
				Integer.parseInt(rows),type);
		List<Merchant> merchants = pages.getList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", merchants);
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
	@RequestMapping(value = "/addMerchant", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody addMerchant(@RequestParam("file") MultipartFile file,
			@RequestParam(name = "merchantname", required = true) @NotBlank @Size(max = 200) String merchantname,
			@RequestParam(name = "url", required = true) @NotBlank @Size(max = 200) String url,
			@RequestParam(name = "type", required = true) @NotBlank @Size(max = 200) String type,
			@RequestParam(name = "tel", required = false) @Size(max = 200) String tel,
			@RequestParam(name = "rank", required = false) @Size(max = 200) String rank,
			@RequestParam(name = "price", required = false) @Size(max = 200) String price,
			@RequestParam(name = "policy", required = false) @Size(max = 200) String policy,
			@RequestParam(name = "culture", required = false) @Size(max = 200) String culture) throws Exception {

		Merchant merchant = new Merchant();
		if (!file.isEmpty()) {
			String returnfilename = FileUtil.writeFile(file, picture_path + "" + type + "/");
			merchant.setImage(type + "/" + returnfilename);
		}
		merchant.setMerchantid(GenerateID.getUUID());
		merchant.setMerchantname(merchantname);
		merchant.setUrl(url);
		merchant.setType(type);
		merchant.setTel(tel);
		merchant.setPrice((new Double(Double.parseDouble(price) * 100)).intValue());
		merchant.setPolicy(policy);
		merchant.setCulture(culture);
		if (rank == null || "".equals(rank)) {
			merchant.setRank(0);
		} else {
			merchant.setRank(Integer.parseInt(rank));
		}

		merchant.setCreatetime(new Date());

		int result = merchantService.insertSelective(merchant); // 0 success 1 failed
		return ResultBody.success(result);
	}

	@RequestMapping(value = "/delMerchant", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody delMerchant(@RequestParam(name = "merchantid") String merchantid) throws Exception {
		Merchant merchant = merchantService.selectByPrimaryKey(merchantid);
		int result = merchantService.deleteByPrimaryKey(merchantid);

		String rootpath = picture_path;
		String filePath = rootpath + merchant.getImage();
		System.out.println(filePath);
		File dest = new File(filePath);
		dest.delete();
		return ResultBody.success(result);
	}

}
