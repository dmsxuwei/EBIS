package com.ebis.adminbackend.dao;

import com.ebis.adminbackend.po.Resources;
import com.ebis.adminbackend.po.ResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourcesMapper {
    int countByExample(ResourcesExample example);

    int deleteByExample(ResourcesExample example);

    int deleteByPrimaryKey(String resourceid);

    int insert(Resources record);

    int insertSelective(Resources record);

    List<Resources> selectByExample(ResourcesExample example);

    Resources selectByPrimaryKey(String resourceid);

    int updateByExampleSelective(@Param("record") Resources record, @Param("example") ResourcesExample example);

    int updateByExample(@Param("record") Resources record, @Param("example") ResourcesExample example);

    int updateByPrimaryKeySelective(Resources record);

    int updateByPrimaryKey(Resources record);
}