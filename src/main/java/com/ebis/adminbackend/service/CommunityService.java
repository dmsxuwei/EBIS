package com.ebis.adminbackend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebis.adminbackend.dao.CommunityMapper;
import com.ebis.adminbackend.po.Community;
import com.ebis.adminbackend.po.CommunityExample;
import com.ebis.adminbackend.po.CommunityExample.Criteria;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @Title
 * @Description
 * @CreateTime 2020年4月23日
 * @author David
 * @version 1.0
 */
@Service
public class CommunityService {
	@Autowired
	private CommunityMapper communityMapper;
	
	
	

	public PageInfo<Community> selectByExample(Integer pageNo, Integer pageSize,String type) {
		pageNo = pageNo == null ? 1 : pageNo;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNo, pageSize);

		CommunityExample example = new CommunityExample();
		// example.setOrderByClause("rank desc");
		Criteria criteria = example.createCriteria();
		if(type!=null && !"".equals(type))criteria.andTypeEqualTo(type);
		List<Community> list = communityMapper.selectByExample(example);
		
		PageInfo<Community> page = new PageInfo<Community>(list);
		return page;
	}

	public List<Community> selectCommunityByType(String type) {
		CommunityExample example = new CommunityExample();
		// example.setOrderByClause("rank desc");
		Criteria criteria = example.createCriteria();
		criteria.andTypeEqualTo(type);
		return communityMapper.selectByExample(example);
	}

	public int insertSelective(Community record) {
		return communityMapper.insertSelective(record);

	}

	public Community selectByPrimaryKey(String companyid) {
		return communityMapper.selectByPrimaryKey(companyid);
	}

	public int deleteByPrimaryKey(String companyid) {
		return communityMapper.deleteByPrimaryKey(companyid);
	}

}
