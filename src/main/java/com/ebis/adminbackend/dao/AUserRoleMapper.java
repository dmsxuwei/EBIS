package com.ebis.adminbackend.dao;

import com.ebis.adminbackend.po.AUserRole;
import com.ebis.adminbackend.po.AUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AUserRoleMapper {
    int countByExample(AUserRoleExample example);

    int deleteByExample(AUserRoleExample example);

    int deleteByPrimaryKey(String userroleid);

    int insert(AUserRole record);

    int insertSelective(AUserRole record);

    List<AUserRole> selectByExample(AUserRoleExample example);

    AUserRole selectByPrimaryKey(String userroleid);

    int updateByExampleSelective(@Param("record") AUserRole record, @Param("example") AUserRoleExample example);

    int updateByExample(@Param("record") AUserRole record, @Param("example") AUserRoleExample example);

    int updateByPrimaryKeySelective(AUserRole record);

    int updateByPrimaryKey(AUserRole record);
}