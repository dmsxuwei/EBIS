package com.ebis.adminbackend.controller;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebis.adminbackend.common.GenerateID;
import com.ebis.adminbackend.common.MenuTree;
import com.ebis.adminbackend.exception.ResultBody;
import com.ebis.adminbackend.model.Menu;
import com.ebis.adminbackend.po.Resources;
import com.ebis.adminbackend.service.ResourceService;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;

@Api(value = "resource", tags = { "resource" })
@RequestMapping("resource")
@RestController
public class ResourceController extends BaseController {
	@Resource
	private ResourceService resourceService;
	private static final Logger log = LoggerFactory.getLogger(ResourceController.class);

	/**
	 * 
	 * @Author David
	 * @CreateTime 2020年4月6日
	 * @Purpose【生成菜单树】 @param parentid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/getResourceForTree", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody getResource(@RequestParam(name = "parentid") String parentid) throws Exception {
		log.info(parentid);
		List<Resources> resources = resourceService.getAllResource();
		log.info("Resourcessize:" + resources.size());

		List<Menu> menuList = new ArrayList<Menu>();
		log.info(resources.get(1).getResourcename());
		for (int i = 0; i < resources.size(); i++) {
			Resources resourcess = resources.get(i);
			String id = resources.get(i).getResourceid();
			String parentId = resources.get(i).getParentid();
			String pText = "";
			String text = resources.get(i).getResourcename();
			String iconCls = resources.get(i).getIconcls();
			String url = resources.get(i).getAddr();
			Integer state = resources.get(i).getIsend();
			Integer isend = resources.get(i).getIsend();
			menuList.add(new Menu(id, parentId + "", pText, text, iconCls + "", url, state + "", isend));
		}
		/* 让我们创建树 */
		MenuTree menuTree = new MenuTree(menuList);
		menuList = menuTree.builTree();

		return ResultBody.success(menuList);

	}

	/**
	 * 
	 * @Author David
	 * @CreateTime 2020年4月6日
	 * @Purpose【表格】 @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/getResourcesForTabel", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getResources(HttpServletRequest request,
			@RequestParam("page") String page,
			@RequestParam("rows") String rows) throws Exception {
		PageInfo<Resources> pages = resourceService.queryAllResourceByPage(Integer.parseInt(page),Integer.parseInt(rows));
		List<Resources> resources = pages.getList();
		log.info("Resourcessize:" + resources.size());
		int total = resourceService.countByExample(null);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", resources);
		map.put("total", total);
		return map;

	}

	/**
	 * 
	 * @Author David
	 * @CreateTime 2020年4月6日
	 * @Purpose【】 @param resources
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/addResources", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody addResources(@RequestBody(required = false) Resources resources) throws Exception {

		resources.setResourceid(GenerateID.getUUID().replace("-", ""));
		int result = resourceService.insertResources(resources); // 0 success 1 failed
		return ResultBody.success(result);
	}

	/**
	 * 
	 * @Author David
	 * @CreateTime 2020年4月6日
	 * @Purpose【删除Resource】 @param parentid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/delResource", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody delResource(@RequestParam(name = "resourceid") String resourceid) throws Exception {

		int result = resourceService.deleteByPrimaryKey(resourceid);
		return ResultBody.success(result);
	}

}
