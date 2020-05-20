package com.ebis.adminbackend.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;

@Api(value = "data", tags = { "基础数据接口" })
@RequestMapping("data")
@RestController
public class BaseDataController {

	@RequestMapping(value = "/getMerchantType", method = RequestMethod.POST)
	@ResponseBody
	public String getMerchantType(HttpServletRequest request) {
		String json="["
				+ "{\"id\":\"1\",\"text\":\"淘宝商家\"},"
				+ "{\"id\":\"2\",\"text\":\"京东商家\"},"
				+ "{\"id\":\"3\",\"text\":\"拼多多商家\"},"
				+ "{\"id\":\"4\",\"text\":\"短视频商家\"}"
				+ "]";
		return json;
	}
	
	@RequestMapping(value = "/getAdvertiseLocation", method = RequestMethod.POST)
	@ResponseBody
	public String getAdvertiseLocation(HttpServletRequest request) {
		String json="["
				+ "{\"id\":\"1\",\"text\":\"首页社区图\"},"
				+ "{\"id\":\"2\",\"text\":\"淘宝右侧\"},"
				+ "{\"id\":\"3\",\"text\":\"京东右侧\"},"
				+ "{\"id\":\"4\",\"text\":\"拼多多右侧\"},"
				+ "{\"id\":\"5\",\"text\":\"短视频右侧\"}"
				
				+ "]";
		return json;
	}
	
	@RequestMapping(value = "/getEventtype", method = RequestMethod.POST)
	@ResponseBody
	public String getEventtype(HttpServletRequest request) {
		String json="["
				+ "{\"id\":\"1\",\"text\":\"名片点击\"},"
				+ "{\"id\":\"2\",\"text\":\"广告点击\"},"
				+ "{\"id\":\"3\",\"text\":\"登陆事件\"},"
				+ "{\"id\":\"4\",\"text\":\"首页浏览\"},"
				+ "{\"id\":\"5\",\"text\":\"其它\"}"
				
				+ "]";
		return json;
	}

	@RequestMapping(value = "/getServertype", method = RequestMethod.POST)
	@ResponseBody
	public String getServertype(HttpServletRequest request) {
		String json="["
				+ "{\"id\":\"1\",\"text\":\"爆款打造\"},"
				+ "{\"id\":\"2\",\"text\":\"流量优化\"},"
				+ "{\"id\":\"3\",\"text\":\"运营支持\"}"
				
				+ "]";
		return json;
	}

}
