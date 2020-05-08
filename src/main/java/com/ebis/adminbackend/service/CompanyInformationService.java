package com.ebis.adminbackend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebis.adminbackend.dao.CCompanyInformationMapper;
import com.ebis.adminbackend.po.CCompanyInformation;
import com.ebis.adminbackend.po.CCompanyInformationExample;
import com.ebis.adminbackend.po.CCompanyInformationExample.Criteria;
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
public class CompanyInformationService {
	@Autowired
	private CCompanyInformationMapper cCompanyInformationMapper;

	public PageInfo<CCompanyInformation> selectByExample(Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null ? 1 : pageNo;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNo, pageSize);

		List<CCompanyInformation> list = cCompanyInformationMapper.selectByExample(null);
		PageInfo<CCompanyInformation> page = new PageInfo<CCompanyInformation>(list);
		return page;
	}

	public List<CCompanyInformation> selectAllCompanyinformation(String type) {
		CCompanyInformationExample example = new CCompanyInformationExample();
		example.setOrderByClause("rank desc");
		Criteria criteria = example.createCriteria();
		criteria.andTypeEqualTo(type);
		return cCompanyInformationMapper.selectByExample(example);
	}

	public int insertSelective(CCompanyInformation record) {
		return cCompanyInformationMapper.insertSelective(record);

	}

	public CCompanyInformation selectByPrimaryKey(String companyid) {
		return cCompanyInformationMapper.selectByPrimaryKey(companyid);
	}

	public int deleteByPrimaryKey(String companyid) {
		return cCompanyInformationMapper.deleteByPrimaryKey(companyid);
	}

}
