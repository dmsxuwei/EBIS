package com.ebis.adminbackend.common;



import java.util.UUID;

/**
 * @Title 
 * @Description 
 * @CreateTime 2020年4月6日
 * @author David
 * @version 1.0
 */
public class GenerateID {
	
	
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	

}

