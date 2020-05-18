package com.ebis.adminbackend.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebis.adminbackend.common.GenerateID;
import com.ebis.adminbackend.common.Storage;
import com.ebis.adminbackend.exception.BizException;
import com.ebis.adminbackend.exception.ResultBody;
import com.ebis.adminbackend.po.AUser;
import com.ebis.adminbackend.service.UserService;

import io.swagger.annotations.Api;

/**
 * @Title
 * @Description
 * @CreateTime 2020年4月11日
 * @author David
 * @version 1.0
 */
@Api(value = "user", tags = { "用户接口" })
@RequestMapping("user")
@RestController
public class UserController extends BaseController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;



	public static final String ACCOUNT_SID = "AC08c25b53f969e30e8e17329f9313abb2";
	public static final String AUTH_TOKEN = "f8b310a548b090853b2b9a16168c33d4";
	
	

	

	

/*	@RequestMapping(value = "/getVerificationcode", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody getVerificationcode(@RequestParam(name = "email", required = true) String email)
			throws Exception {
		if (!StringMatcher.checkEmail(email)) {
			throw new BizException(CommonEnum.BODY_NOT_MATCH);
		}
		log.info(email);
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(system_email);
		message.setTo(email);
		message.setSubject("Register chefus");
		String verificationcode = GenerateID.getUUID();
		Storage.getInstance().put("register_" + email, verificationcode);
		message.setText("You verification code:" + verificationcode);
		log.info("SEND.");
		mailSender.send(message);
		return ResultBody.success("");
	}*/


	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody register(
			@RequestParam(name = "password", required = false) String password,
			@RequestParam(name = "username", required = false) String username) throws Exception {
		//Map<String, String> storage = Storage.getInstance();

		AUser user = new AUser();
		user.setUserid(GenerateID.getUUID());
		user.setUsername(username);
		user.setPassword(password);

		int result = userService.insert(user);
		if (result == 0)
			throw new BizException("-1", "insert user failed!");

		return ResultBody.success(result);
	}





	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public ResultBody login(@RequestParam(name = "username", required = false) String username,
			@RequestParam(name = "password", required = false) String password) throws Exception {
		List<AUser>  users  =  userService.queryUserByUsername(username);
	

		if (users == null||users.size()!=1) {
			throw new BizException("-1","query user error");
		} else {
			
			if (password.equals(users.get(0).getPassword())) {
				log.info("login success!");
				String secretid = GenerateID.getUUID();
				Storage.getInstance().put(secretid, users.get(0).getUserid());
				return ResultBody.success(secretid);
			} else {
				throw new BizException("-1","password error");
			}
		}
	}


/*	public String SendSms(String mobilenumber, String verificationcode) {
String result = "";
try {
	CloseableHttpClient client = null;
	CloseableHttpResponse response = null;

	try {
		List<BasicNameValuePair> formparams = new ArrayList<BasicNameValuePair>();
		formparams.add(new BasicNameValuePair("Account", "18207495502"));
		formparams.add(new BasicNameValuePair("Pwd", "240c759e98bd9354aa5689e42"));// 登录后台 首页显示
		formparams.add(new BasicNameValuePair("Content", "您的验证码是:" + verificationcode));
		formparams.add(new BasicNameValuePair("Mobile", mobilenumber));
		formparams.add(new BasicNameValuePair("SignId", "261190"));// 登录后台 添加签名获取id

		HttpPost httpPost = new HttpPost("http://api.feige.ee/SmsService/Send");
		httpPost.setEntity(new UrlEncodedFormEntity(formparams, "UTF-8"));
		client = HttpClients.createDefault();
		response = client.execute(httpPost);
		HttpEntity entity = response.getEntity();
		result = EntityUtils.toString(entity);
		System.out.println("结果：" + result);
	} finally {
		if (response != null) {
			response.close();
		}
		if (client != null) {
			client.close();
		}
	}
} catch (Exception e) {
	e.printStackTrace();
}
return result;

}*/


}
