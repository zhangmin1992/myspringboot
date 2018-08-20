package com.my.springboot.properties;

import org.springframework.stereotype.Component;

@Component
public class RedisPropertiesUse {

	private static RedisProperties my;
	
	public RedisPropertiesUse(RedisProperties redisProperties){
		this.my = redisProperties;
		System.out.println(my.getHost());
		init();
	}
	
	public static void init(){
		System.out.println(my.getHost());
	}
}
