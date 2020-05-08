package com.ebis.adminbackend.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebis.adminbackend.common.GenerateID;
import com.ebis.adminbackend.common.util.IpUtil;
import com.ebis.adminbackend.exception.ResultBody;
import com.ebis.adminbackend.po.Monitor;
import com.ebis.adminbackend.service.MonitorService;

import io.swagger.annotations.Api;

@Api(value = "monitor", tags = { "网站监视" })
@RequestMapping("monitor")
@RestController
public class MonitorController {
	private static final Logger log = LoggerFactory.getLogger(MonitorController.class);

	@Autowired
	private MonitorService monitorService;

	@RequestMapping(value = "/accessRecord", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody getMerchantsForweb(HttpServletRequest request, @RequestParam(name = "msg") String msg)
			throws Exception {
		// 获取IP地址
		String ipAddress = IpUtil.getIpAddr(request);
		log.info(ipAddress);
		Monitor record=new Monitor();
		record.setMonitorid(GenerateID.getUUID());
		record.setIpadress(ipAddress);
		record.setIsregister("0");
		record.setEventtime(new Date());
		
		int result = monitorService.insert(record);

		return ResultBody.success(result);
	}

}
