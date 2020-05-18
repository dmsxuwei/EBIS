package com.ebis.adminbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ebis.adminbackend.dao.MonitorMapper;
import com.ebis.adminbackend.po.Monitor;
import com.ebis.adminbackend.po.MonitorExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class MonitorService {
	
	@Autowired
	private MonitorMapper monitorMapper;
	
	public PageInfo<Monitor> selectByExample(Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null ? 1 : pageNo;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNo, pageSize);

		List<Monitor> list = monitorMapper.selectByExample(null);
		PageInfo<Monitor> page = new PageInfo<Monitor>(list);
		return page;
	}


    public int insert(Monitor record) {
    	return monitorMapper.insert(record);
    }



    List<Monitor> selectByExample(MonitorExample example){
    	return monitorMapper.selectByExample(example);
    }

   

}
