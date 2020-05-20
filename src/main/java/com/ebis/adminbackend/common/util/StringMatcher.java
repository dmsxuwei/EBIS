package com.ebis.adminbackend.common.util;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Title
 * @Description
 * @CreateTime 2020年4月16日
 * @author David
 * @version 1.0
 */
public class StringMatcher {

	public static boolean checkEmail(String email) {
		// 电子邮件
		String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern regex = Pattern.compile(check);
		Matcher matcher = regex.matcher(email);
		boolean isMatched = matcher.matches();
		System.out.println(isMatched);
		return isMatched;
	}

	/*
	 * 电话号码
	 * 
	 * String check = "^(13[4,5,6,7,8,9]|15[0,8,9,1,7]|188|187)\\d{8}$"; Pattern
	 * regex = Pattern.compile(check); Matcher matcher =
	 * regex.matcher("13555655606"); boolean isMatched = matcher.matches();
	 * System.out.println(isMatched);
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringMatcher.checkEmail("abc@12.com"));
	}

}
