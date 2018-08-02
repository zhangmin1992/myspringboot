package com.my.springboot.importSource;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


/**
 *  @ImportResource 加载外部的xml文件并且是xml文件生效，xml文件中注册的bean会被加载到spring容器中
 */ 
@ImportResource(locations={"classpath:beans.xml"})
@EnableAutoConfiguration
@ComponentScan("importSource")
public class HelloWorldMainApplication {

    public static void main(String[] args) {

    	ConfigurableApplicationContext context = SpringApplication.run(HelloWorldMainApplication.class,args);
    	System.out.println(context.getBean("xmlMyBean"));
    	context.close();
    }
}
