package com.my.springboot.conditionalOnBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class);
		TairClientProperties beanConfig = context.getBean(TairClientProperties.class);
		System.out.println(beanConfig.getLocalAppKey());
		GetTairClientProperties getTairClientProperties = context.getBean(GetTairClientProperties.class);
		getTairClientProperties.show();
		context.close();
	}
	
}
