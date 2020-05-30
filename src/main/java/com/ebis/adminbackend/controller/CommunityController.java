package com.ebis.adminbackend.controller;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Size;
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
import com.ebis.adminbackend.po.Community;
import com.ebis.adminbackend.service.CommunityService;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;

@Api(value = "community", tags = { "广告接口" })
@RequestMapping("community")
@RestController
public class CommunityController extends BaseController {

	private static final Logger log = LoggerFactory.getLogger(CommunityController.class);

	@Autowired
	private CommunityService communityService;


	
	/**
	 * 分页
	 * @param request
	 * @param page
	 * @param rows
	 * @param type
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getCommunitysForWeb", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody getCommunitysByPage(@RequestParam(name = "type", required=false) String type) throws Exception {
		List<Community> communitys= communityService.selectCommunityByType( type);
		return ResultBody.success(communitys);
	}

	// =============================后台===================================================

	@RequestMapping(value = "/getCommunitys", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getCommunitys(HttpServletRequest request, @RequestParam(name = "page") String page,
			@RequestParam(name = "rows") String rows,@RequestParam(name = "type", required=false) String type) throws Exception {
		PageInfo<Community> pages = communityService.selectByExample(Integer.parseInt(page),
				Integer.parseInt(rows),type);
		List<Community> communitys = pages.getList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", communitys);
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
	@RequestMapping(value = "/addCommunity", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody addMerchant(@RequestParam("file") MultipartFile file,
			@RequestParam(name = "companyid", required = false)String companyid,
			@RequestParam(name = "type", required = true) String type,
			@RequestParam(name = "url", required = true) String url,
			@RequestParam(name = "policy", required = false) String policy,
			@RequestParam(name = "rank", required = false) @Size(max = 200) String rank) throws Exception {

	    
		Community community = new Community();
		if (!file.isEmpty()) {
			String returnfilename = FileUtil.writeFile(file, picture_path + "" + type + "/");
			community.setImage(type + "/" + returnfilename);
		}
		
		community.setCommunityid(GenerateID.getUUID());
		if (companyid != null && !"".equals(companyid))community.setCompanyid(companyid);
		
		community.setType(type);
		community.setUrl(url);
		if (rank == null || "".equals(rank)) {
			community.setRank(0);
		} else {
			community.setRank(Integer.parseInt(rank));
		}
		
		if (policy != null && !"".equals(policy))community.setPolicy(policy);

		community.setCreatetime(new Date());

		int result = communityService.insertSelective(community); // 0 success 1 failed
		return ResultBody.success(result);
	}

	@RequestMapping(value = "/delCommunity", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody delMerchant(@RequestParam(name = "communityid") String communityid) throws Exception {
		Community community = communityService.selectByPrimaryKey(communityid);
		int result = communityService.deleteByPrimaryKey(communityid);

		String rootpath = picture_path;
		String filePath = rootpath + community.getImage();
		System.out.println(filePath);
		File dest = new File(filePath);
		dest.delete();
		return ResultBody.success(result);
	}

}
