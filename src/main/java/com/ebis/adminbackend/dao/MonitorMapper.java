package com.ebis.adminbackend.dao;

import com.ebis.adminbackend.po.Monitor;
import com.ebis.adminbackend.po.MonitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonitorMapper {
    int countByExample(MonitorExample example);

    int deleteByExample(MonitorExample example);

    int deleteByPrimaryKey(String monitorid);

    int insert(Monitor record);

    int insertSelective(Monitor record);

    List<Monitor> selectByExample(MonitorExample example);

    Monitor selectByPrimaryKey(String monitorid);

    int updateByExampleSelective(@Param("record") Monitor record, @Param("example") MonitorExample example);

    int updateByExample(@Param("record") Monitor record, @Param("example") MonitorExample example);

    int updateByPrimaryKeySelective(Monitor record);

    int updateByPrimaryKey(Monitor record);
}