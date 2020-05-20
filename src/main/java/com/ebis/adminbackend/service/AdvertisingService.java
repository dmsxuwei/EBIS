package com.ebis.adminbackend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebis.adminbackend.dao.AdvertisingMapper;
import com.ebis.adminbackend.po.Advertising;
import com.ebis.adminbackend.po.AdvertisingExample;
import com.ebis.adminbackend.po.AdvertisingExample.Criteria;
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
public class AdvertisingService {
	@Autowired
	private AdvertisingMapper advertisingMapper;
	
	
	

	public PageInfo<Advertising> selectByExample(Integer pageNo, Integer pageSize,String location) {
		pageNo = pageNo == null ? 1 : pageNo;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNo, pageSize);

		AdvertisingExample example = new AdvertisingExample();
		// example.setOrderByClause("rank desc");
		Criteria criteria = example.createCriteria();
		if(location!=null && !"".equals(location))criteria.andLocationEqualTo(location);
		List<Advertising> list = advertisingMapper.selectByExample(example);
		
		PageInfo<Advertising> page = new PageInfo<Advertising>(list);
		return page;
	}

	public List<Advertising> selectlAdvertisingByLocation(String location) {
		AdvertisingExample example = new AdvertisingExample();
		// example.setOrderByClause("rank desc");
		Criteria criteria = example.createCriteria();
		criteria.andLocationEqualTo(location);
		return advertisingMapper.selectByExample(example);
	}

	public int insertSelective(Advertising record) {
		return advertisingMapper.insertSelective(record);

	}

	public Advertising selectByPrimaryKey(String companyid) {
		return advertisingMapper.selectByPrimaryKey(companyid);
	}

	public int deleteByPrimaryKey(String companyid) {
		return advertisingMapper.deleteByPrimaryKey(companyid);
	}

}
