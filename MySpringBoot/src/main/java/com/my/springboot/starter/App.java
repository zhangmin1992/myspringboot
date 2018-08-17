package com.my.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import redis.clients.jedis.Jedis;

/**
 *  测试自己写的redis启动器是否可用
 *  解决明明已经在依赖项目中加入了这个redis依赖，引用之后可以直接使用的，确保错
 *  org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'redis.clients.jedis.Jedis
 *  第一种方式，修改启动器，在本项目使用的时候用@EnableRedis
 *  第二种方式，
 * @author yp-tc-m-7129
 *
 */
//@EnableRedis
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		context.getBean(Jedis.class).set("hh", "567890");
		System.out.println(context.getBean(Jedis.class).get("hh"));
	}
}
