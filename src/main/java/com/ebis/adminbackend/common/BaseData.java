package com.ebis.adminbackend.common;



import java.util.HashMap;
import java.util.Map;

/**
 * @Title 
 * @Description 
 * @CreateTime 2020年4月11日
 * @author David
 * @version 1.0
 */
public class BaseData {
	
	
	public static Map<String,String> merchantType(){
		Map<String,String> merchantType=new HashMap<String,String>();
		merchantType.put("1", "淘宝商家");
		merchantType.put("2", "京东商家");
		merchantType.put("3", "拼多多商家");
		merchantType.put("4", "短视频商家");
		return merchantType;
	}
	
	public static Map<String,String> merchantServiceType(){
		Map<String,String> merchantType=new HashMap<String,String>();
		merchantType.put("1", "爆款打造");
		merchantType.put("2", "流量优化");
		merchantType.put("3", "运营支持");
		return merchantType;
	}
	
	public static Map<String,String> getWeek(){
		Map<String,String> week=new HashMap<String,String>();
		week.put("1", "Monday");
		week.put("2", "Tuesday");
		week.put("3", "Wednesday");
		week.put("4", "Thursday");
		week.put("5", "Friday");
		week.put("6", "Saturday");
		week.put("7", "Sunday");
		week.put("8", "everyday");
		return week;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

