package com.ebis.adminbackend.service;





import java.util.List;
import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.ebis.adminbackend.dao.ResourcesMapper;
import com.ebis.adminbackend.po.Resources;
import com.ebis.adminbackend.po.ResourcesExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @Title
 * @Description
 * @CreateTime 2020年4月6日
 * @author David
 * @version 1.0
 */
@Service
public class ResourceService {

	@Resource
	private ResourcesMapper resourceDao;

	
	/**
	 * 
	 * @Author David
	 * @CreateTime 2020年4月6日
	 * @Purpose【】
	 * @param parentid
	 * @return
	 */
	public List<Resources> getResourceByparentId(String parentid) {
		ResourcesExample resourcesExample = new ResourcesExample();
		resourcesExample.setOrderByClause("'sort' desc");
		resourcesExample.createCriteria().andParentidEqualTo(parentid);
		return resourceDao.selectByExample(resourcesExample);
	}

	
	/**
	 * 
	 * @Author David
	 * @CreateTime 2020年4月6日
	 * @Purpose【菜单】
	 * @return
	 */
	public List<Resources> getAllResource() {
		ResourcesExample resourcesExample = new ResourcesExample();
		resourcesExample.setOrderByClause("`sort` desc");
		return resourceDao.selectByExample(resourcesExample);
	}

	/**
	 * 
	 * @Author David
	 * @CreateTime 2020年4月6日
	 * @Purpose【表格】
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Resources> queryAllResourceByPage(Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null ? 1 : pageNo;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNo, pageSize);

		ResourcesExample resourcesExample = new ResourcesExample();
		resourcesExample.setOrderByClause("`sort` desc");

		List<Resources> list = resourceDao.selectByExample(resourcesExample);
		PageInfo<Resources> page = new PageInfo<Resources>(list);
		return page;
	}
	
	

	public int countByExample(ResourcesExample example) {
		return resourceDao.countByExample(example);
	}

	
	public int insertResources(Resources resources) {

		return resourceDao.insert(resources);
	}

	public int deleteByPrimaryKey(String resourceid) {
		return resourceDao.deleteByPrimaryKey(resourceid);
	}

}
