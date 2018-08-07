package com.my.springboot.ConditionalOnProperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @ConditionalOnProperty 去默认资源文件中找前缀是prefix，key=name的属性值，
 * 如果不存在直接返回true
 * 如果存在和指定的havingValue进行比较，如果一致是true，如果不一致时false
 * true的时候这个bean加载，false的时候这个bean不会被加载
 */
@EnableAutoConfiguration
@ComponentScan
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		System.out.println(context.getBean(MyBean.class));
		System.out.println("----end-----");
	}
	
	@ConditionalOnProperty(prefix = "my.person", name = "name", havingValue = "ww", matchIfMissing = true)
	@Bean
	public MyBean myBean() {
		return new MyBean();
	}
}
