package com.ebis.adminbackend.controller;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ebis.adminbackend.common.FileUtil;
import com.ebis.adminbackend.common.GenerateID;
import com.ebis.adminbackend.exception.ResultBody;
import com.ebis.adminbackend.po.CCompanyInformation;
import com.ebis.adminbackend.service.CompanyInformationService;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;

@Api(value = "merchant", tags = { "商家接口" })
@RequestMapping("merchant")
@RestController
public class MechantController extends BaseController {

	private static final Logger log = LoggerFactory.getLogger(MechantController.class);

	@Autowired
	private CompanyInformationService companyInformationService;

	@RequestMapping(value = "/getMerchantsForweb_home", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody getMerchantsForweb(HttpServletRequest request, @RequestParam(name = "type") String type)
			throws Exception {
		log.info("" + type);
		List<CCompanyInformation> cCompanyInformations = companyInformationService.selectAllCompanyinformation(type);
		return ResultBody.success(cCompanyInformations);
	}
	
	

	// ================================================================================

	@RequestMapping(value = "/getMerchants", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getMerchants(HttpServletRequest request, @RequestParam(name = "page") String page,
			@RequestParam(name = "rows") String rows) throws Exception {
		PageInfo<CCompanyInformation> pages = companyInformationService.selectByExample(Integer.parseInt(page),
				Integer.parseInt(rows));
		List<CCompanyInformation> cCompanyInformations = pages.getList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", cCompanyInformations);
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
			@RequestParam(name = "companyname", required = true) @NotBlank @Size(max = 200) String companyname,
			@RequestParam(name = "url", required = true) @NotBlank @Size(max = 200) String url,
			@RequestParam(name = "type", required = true) @NotBlank @Size(max = 200) String type,
			@RequestParam(name = "tel", required = false) @Size(max = 200) String tel,
			@RequestParam(name = "rank", required = false) @Size(max = 200) String rank) throws Exception {

		CCompanyInformation cCompanyInformation = new CCompanyInformation();
		if (!file.isEmpty()) {
			String returnfilename = FileUtil.writeFile(file, picture_path + "" + type + "/");
			cCompanyInformation.setImage(type + "/" + returnfilename);
		}
		cCompanyInformation.setCompanyid(GenerateID.getUUID());
		cCompanyInformation.setCompanyname(companyname);
		cCompanyInformation.setUrl(url);
		cCompanyInformation.setType(type);
		cCompanyInformation.setTel(tel);
		if (rank == null || "".equals(rank)) {
			cCompanyInformation.setRank(0);
		} else {
			cCompanyInformation.setRank(Integer.parseInt(rank));
		}

		cCompanyInformation.setCreatetime(new Date());

		int result = companyInformationService.insertSelective(cCompanyInformation); // 0 success 1 failed
		return ResultBody.success(result);
	}

	@RequestMapping(value = "/delMerchant", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody delMerchant(@RequestParam(name = "companyid") String companyid) throws Exception {
		CCompanyInformation cCompanyInformation = companyInformationService.selectByPrimaryKey(companyid);
		int result = companyInformationService.deleteByPrimaryKey(companyid);

		String rootpath = picture_path;
		String filePath = rootpath + cCompanyInformation.getImage();
		System.out.println(filePath);
		File dest = new File(filePath);
		dest.delete();
		return ResultBody.success(result);
	}

}
