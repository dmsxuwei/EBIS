package com.ebis.adminbackend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebis.adminbackend.dao.MerchantMapper;
import com.ebis.adminbackend.po.Merchant;
import com.ebis.adminbackend.po.MerchantExample;
import com.ebis.adminbackend.po.MerchantExample.Criteria;
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
public class MerchantService {
	@Autowired
	private MerchantMapper MerchantMapper;

	public PageInfo<Merchant> selectByExample(Integer pageNo, Integer pageSize,String type) {
		pageNo = pageNo == null ? 1 : pageNo;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNo, pageSize);

		MerchantExample example = new MerchantExample();
		example.setOrderByClause("rank desc");
		Criteria criteria = example.createCriteria();
		if(type!=null &&! "".equals(type))criteria.andTypeEqualTo(type);
		
		List<Merchant> list = MerchantMapper.selectByExample(example);
		PageInfo<Merchant> page = new PageInfo<Merchant>(list);
		return page;
	}

	public List<Merchant> selectAllCompanyinformation(String type) {
		MerchantExample example = new MerchantExample();
		example.setOrderByClause("rank desc");
		Criteria criteria = example.createCriteria();
		criteria.andTypeEqualTo(type);
		return MerchantMapper.selectByExample(example);
	}

	public int insertSelective(Merchant record) {
		return MerchantMapper.insertSelective(record);

	}

	public Merchant selectByPrimaryKey(String companyid) {
		return MerchantMapper.selectByPrimaryKey(companyid);
	}

	public int deleteByPrimaryKey(String companyid) {
		return MerchantMapper.deleteByPrimaryKey(companyid);
	}

}
