package com.my.springboot.internalProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import redis.clients.jedis.Jedis;

/**
 * springboot项目可以自动加载application.properties文件，并且赋值到Environment中
 * spring项目需要指定加载application.properties文件，并且Environment中没有加载的值
 * @author yp-tc-m-7129
 *
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		System.out.println(context.getBean(Environment.class).getProperty("hello"));
	}
}
