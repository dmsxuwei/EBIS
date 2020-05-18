package com.ebis.adminbackend.common;



import java.util.HashMap;
import java.util.Map;

/**
 * @Title
 * @Description
 * @CreateTime 2020年4月6日
 * @author David
 * @version 1.0
 */
public class Storage {

	public static void main(String[] args) {
		Map<String, String> instance = Storage.getInstance();
		instance.put("name", "David");
		System.out.println(instance.get("name"));

	}

	private static volatile Map<String, String> instance;

	// 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
	// 同时保证了效率, 推荐使用

	public static synchronized Map<String, String> getInstance() {
		if (instance == null) {
			synchronized (Storage.class) {
				if (instance == null) {
					instance = new HashMap<String, String>();
				}
			}

		}
		return instance;
	}

}
