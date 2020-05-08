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

}
