package com.ebis.adminbackend.controller;




import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(value = "BaseController", tags = { "基础接口" })
@RequestMapping("BaseController")
@RestController
public class BaseController {
	
	@Value("${picture_path}")
	protected String picture_path;
	
	/*@Autowired
	protected FeignService feignService;*/
	
}
