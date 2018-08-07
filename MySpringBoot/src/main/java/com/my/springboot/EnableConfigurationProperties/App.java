package com.my.springboot.EnableConfigurationProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @EnableConfigurationProperties(MyPropertiesBean.class)
 * 他的作用是让资源文件和实体bean匹配，并把实体bean加入到spring容器中，相当于
 * @Component
   @ConfigurationProperties(prefix="my.person")
   
   @ConfigurationProperties 从默认配置文件中匹配指定的值和我们的属性值进行匹配，my_ha 可以和myHa匹配
 * @author yp-tc-m-7129
 *
 */
@EnableAutoConfiguration
@ComponentScan
//@EnableConfigurationProperties(MyPropertiesBean.class)
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		System.out.println(context.getBean(MyPropertiesBean.class).getName());
		System.out.println(context.getBean(MyPropertiesBean.class).getMyHa());
		/**
		 * 只有一个构造参数的时候，会从容器中拿这个bean，没有就试图去创建这个bean,相当于直接注入MyPropertiesBean，
		 * 属于 spring循环依赖的构造器依赖
		 */
		context.getBean(getMyPropertiesBean.class).getMyName();
		System.out.println("----end-----");
	}
}
