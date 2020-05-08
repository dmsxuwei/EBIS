package com.ebis.adminbackend.dao;

import com.ebis.adminbackend.po.CCompanyInformation;
import com.ebis.adminbackend.po.CCompanyInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CCompanyInformationMapper {
    int countByExample(CCompanyInformationExample example);

    int deleteByExample(CCompanyInformationExample example);

    int deleteByPrimaryKey(String companyid);

    int insert(CCompanyInformation record);

    int insertSelective(CCompanyInformation record);

    List<CCompanyInformation> selectByExample(CCompanyInformationExample example);

    CCompanyInformation selectByPrimaryKey(String companyid);

    int updateByExampleSelective(@Param("record") CCompanyInformation record, @Param("example") CCompanyInformationExample example);

    int updateByExample(@Param("record") CCompanyInformation record, @Param("example") CCompanyInformationExample example);

    int updateByPrimaryKeySelective(CCompanyInformation record);

    int updateByPrimaryKey(CCompanyInformation record);
}