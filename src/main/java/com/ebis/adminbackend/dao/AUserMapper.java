package com.ebis.adminbackend.dao;

import com.ebis.adminbackend.po.AUser;
import com.ebis.adminbackend.po.AUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AUserMapper {
    int countByExample(AUserExample example);

    int deleteByExample(AUserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(AUser record);

    int insertSelective(AUser record);

    List<AUser> selectByExample(AUserExample example);

    AUser selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") AUser record, @Param("example") AUserExample example);

    int updateByExample(@Param("record") AUser record, @Param("example") AUserExample example);

    int updateByPrimaryKeySelective(AUser record);

    int updateByPrimaryKey(AUser record);
}