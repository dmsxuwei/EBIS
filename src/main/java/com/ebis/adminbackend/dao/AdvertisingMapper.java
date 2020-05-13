package com.ebis.adminbackend.dao;

import com.ebis.adminbackend.po.Advertising;
import com.ebis.adminbackend.po.AdvertisingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvertisingMapper {
    int countByExample(AdvertisingExample example);

    int deleteByExample(AdvertisingExample example);

    int deleteByPrimaryKey(String advertisingid);

    int insert(Advertising record);

    int insertSelective(Advertising record);

    List<Advertising> selectByExample(AdvertisingExample example);

    Advertising selectByPrimaryKey(String advertisingid);

    int updateByExampleSelective(@Param("record") Advertising record, @Param("example") AdvertisingExample example);

    int updateByExample(@Param("record") Advertising record, @Param("example") AdvertisingExample example);

    int updateByPrimaryKeySelective(Advertising record);

    int updateByPrimaryKey(Advertising record);
}