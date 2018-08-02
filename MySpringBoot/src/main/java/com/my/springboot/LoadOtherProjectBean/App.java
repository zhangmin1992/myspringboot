package com.my.springboot.LoadOtherProjectBean;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import bean.Car;

/**
 * springboot加载其他项目的bean需要的东西
 * 1.pom文件的依赖(其他项目的pom)
 * 2.META-INF/spring.factories资源文件配置
 * org.springframework.boot.autoconfigure.EnableAutoConfiguration=bean.Car
 * @author yp-tc-m-7129
 *
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {

    	ConfigurableApplicationContext context = SpringApplication.run(App.class,args);
    	/**
    	 * 加载其他项目下的bean
    	 */
    	/*System.out.println("---"+context.getBean(MyBean.class));
    	System.out.println("---"+context.getBean(Car.class));
    	System.out.println("容器中bean的个数是"+context.getBeanDefinitionCount());*/
    	
    	/**
    	 * 这个时候并没有加载其他项目下的bean，但是可以把这个bean当做实体来使用
    	 */
    	Car car = new Car();
    	context.getBean(MyBean.class).show(car);
    	System.out.println("---"+context.getBean(Car.class));
    	context.close();
    }
}
