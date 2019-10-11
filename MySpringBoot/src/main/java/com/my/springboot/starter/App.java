//package com.my.springboot.starter;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//
//import com.my.springboot.spring_boot_starter_redis.bean.RedisCacheAspect;
//import com.my.springboot.spring_boot_starter_redis.bean.RedisClient;
//import com.my.springboot.spring_boot_starter_redis.bean.RedisProperties;
//import com.my.springboot.spring_boot_starter_redis.bean.RedisToolUtils;
//
///**
// *  测试自己写的redis启动器是否可用，可以直接使用redis工具类，redis缓存
// *  解决明明已经在依赖项目中加入了这个redis依赖，引用之后可以直接使用的，确保错
// *  org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'redis.clients.jedis.Jedis
// *  第一种方式，修改启动器，在本项目使用的时候用@EnableRedis
// *  第二种方式，在本项目的资源文件下用
// *  org.springframework.boot.autoconfigure.EnableAutoConfiguration=bean.MyConfig
// *  方式三：加载其他项目的包
// * @author yp-tc-m-7129
// *
// */
//@SpringBootApplication
//
///**
// * 加载其他项目下的bean
// * @author yp-tc-m-7129
// */
//@ComponentScan(value={"com.my.springboot.spring_boot_starter_redis.bean","com.my.springboot.starter"})
//public class App {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
//		System.out.println(context.getBean(RedisCacheAspect.class));
//		System.out.println(context.getBean(RedisClient.class));
//		System.out.println(context.getBean(RedisProperties.class));
//		
//		
//		
////		context.getBean(Jedis.class).set("hh", "567890");
////		System.out.println(context.getBean(Jedis.class).get("hh"));
//		TestServiceImpl2 testServiceImpl = context.getBean(TestServiceImpl2.class);
//    	testServiceImpl.testServiceMethod();
//    	testServiceImpl.testServiceMethod();
//    	testServiceImpl.testServiceMethod();
//    	
//    	RedisToolUtils.set("mm", "mm");
//    	context.close();
//	}
//}
