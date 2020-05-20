package com.ebis.adminbackend.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;

@Api(value = "monitor", tags = { "网站监视" })
@RequestMapping("monitor")
@RestController
public class MonitorController {
	private static final Logger log = LoggerFactory.getLogger(MonitorController.class);

	@Autowired
	private MonitorService monitorService;

	
/*	+ "{\"id\":\"1\",\"text\":\"名片点击\"},"
	+ "{\"id\":\"2\",\"text\":\"广告点击\"},"
	+ "{\"id\":\"3\",\"text\":\"登陆事件\"},"
	+ "{\"id\":\"4\",\"text\":\"首页浏览\"},"
	+ "{\"id\":\"5\",\"text\":\"其它\"}"*/
	
	@RequestMapping(value = "/accessRecord", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody accessRecord(HttpServletRequest request, @RequestParam(name = "type",required=true) String type)
			throws Exception {
		// 获取IP地址
		String ipAddress = IpUtil.getIpAddr(request);
		
		List<Monitor> monitos=monitorService.selectByIpAddress(ipAddress);
		if(monitos.size()>0) {
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			Date eventdate=monitos.get(0).getEventtime();
			String eventstr=f.format(eventdate);
			Date nowdate=new Date();
			String nowdatestr=f.format(nowdate);
			if(nowdatestr.equals(eventstr)) {
				System.out.println("当天重复访问");
				return ResultBody.success("当天重复访问");
			}
		}
		
		log.info(ipAddress);
		Monitor record=new Monitor();
		record.setMonitorid(GenerateID.getUUID());
		record.setIpadress(ipAddress);
		record.setIsregister("0");
		record.setEventtype(type);
		record.setEventtime(new Date());
		
		int result = monitorService.insert(record);

		return ResultBody.success(result);
	}
	
	
	// ========================后台========================================================
	@RequestMapping(value = "/getMonitors", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getMerchants(HttpServletRequest request, @RequestParam(name = "page") String page,
			@RequestParam(name = "rows") String rows) throws Exception {
		PageInfo<Monitor> pages = monitorService.selectByExample(Integer.parseInt(page),
				Integer.parseInt(rows));
		List<Monitor> cCompanyInformations = pages.getList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("rows", cCompanyInformations);
		map.put("total", pages.getTotal());
		return map;
	}
	
	
	

}
