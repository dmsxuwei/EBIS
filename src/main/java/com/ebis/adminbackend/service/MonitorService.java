package com.ebis.adminbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ebis.adminbackend.dao.MonitorMapper;
import com.ebis.adminbackend.po.Monitor;
import com.ebis.adminbackend.po.MonitorExample;

@Service
public class MonitorService {
	
	@Autowired
	private MonitorMapper monitorMapper;
	
	//int countByExample(MonitorExample example);


    public int insert(Monitor record) {
    	return monitorMapper.insert(record);
    }



    List<Monitor> selectByExample(MonitorExample example){
    	return monitorMapper.selectByExample(example);
    }

   

}
