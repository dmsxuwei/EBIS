package com.ebis.adminbackend.dao;

import com.ebis.adminbackend.po.ARoleResources;
import com.ebis.adminbackend.po.ARoleResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ARoleResourcesMapper {
    int countByExample(ARoleResourcesExample example);

    int deleteByExample(ARoleResourcesExample example);

    int deleteByPrimaryKey(String roleresourceid);

    int insert(ARoleResources record);

    int insertSelective(ARoleResources record);

    List<ARoleResources> selectByExample(ARoleResourcesExample example);

    ARoleResources selectByPrimaryKey(String roleresourceid);

    int updateByExampleSelective(@Param("record") ARoleResources record, @Param("example") ARoleResourcesExample example);

    int updateByExample(@Param("record") ARoleResources record, @Param("example") ARoleResourcesExample example);

    int updateByPrimaryKeySelective(ARoleResources record);

    int updateByPrimaryKey(ARoleResources record);
}