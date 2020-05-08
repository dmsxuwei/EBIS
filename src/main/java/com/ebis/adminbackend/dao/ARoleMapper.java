package com.ebis.adminbackend.dao;

import com.ebis.adminbackend.po.ARole;
import com.ebis.adminbackend.po.ARoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ARoleMapper {
    int countByExample(ARoleExample example);

    int deleteByExample(ARoleExample example);

    int deleteByPrimaryKey(String roleid);

    int insert(ARole record);

    int insertSelective(ARole record);

    List<ARole> selectByExample(ARoleExample example);

    ARole selectByPrimaryKey(String roleid);

    int updateByExampleSelective(@Param("record") ARole record, @Param("example") ARoleExample example);

    int updateByExample(@Param("record") ARole record, @Param("example") ARoleExample example);

    int updateByPrimaryKeySelective(ARole record);

    int updateByPrimaryKey(ARole record);
}