package com.ebis.adminbackend;

import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageHelper;

@SpringBootApplication
@MapperScan("com.ebis.adminbackend.dao")
public class Adminbackend 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(Adminbackend.class, args);
    }
    
	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum", "true");
		properties.setProperty("rowBoundsWithCount", "true");
		properties.setProperty("reasonable", "true");
		properties.setProperty("dialect", "mysql");
		pageHelper.setProperties(properties);
		return pageHelper;
	}
    
}
