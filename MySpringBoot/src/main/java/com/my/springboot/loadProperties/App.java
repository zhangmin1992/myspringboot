package com.my.springboot.loadProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
/**
 * spring的元注解信息
 * @Repeatable  标记表明该注解可以应用于相当的声明
 * @author yp-tc-m-7129
 *
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		/**
		 * 加载默认资源文件的内容到bean中，有前缀
		 * @ConfigurationProperties(prefix="my.person")
		 */
		/*System.out.println("----"+context.getBean(Person.class).getName());
		System.out.println("----"+context.getBean(Person.class).getHa());*/
		
		/**
		 * @PropertySource 可以加载其他资源文件的属性,如果这个other文件中没有就会加载默认资源文件的name，还找不到会返回空
		 * @PropertySource(value="classpath:other.properties")
		 * @ConfigurationProperties(prefix="my.person")
		 */
		System.out.println("----"+context.getBean(Person2.class).getHa());
		System.out.println("----"+context.getBean(Person2.class).getName());
		System.out.println("----"+context.getBean(Person2.class).getNi());
		context.close();
	}
}
