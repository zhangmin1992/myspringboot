package com.my.springboot.Conditional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @Conditional(MyConditional.class)
 * 条件判断类MyConditional，返回true，才会添加mybean组件，或者说其他的配置才会生效
 * @author yp-tc-m-7129
 *
 */
@EnableAutoConfiguration
@ComponentScan
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		System.out.println(context.getBean(MyBean.class));
		System.out.println("----end-----");
	}
	
}
