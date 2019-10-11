//package com.my.springboot.ConditionalOnMissingBean;
//
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//
//import bean.Person;
//
///**
// * 不太理解不太会使用的
// * @ConditionalOnClass 的使用
//   @ConditionalOnMissingBean 的使用
// * @author yp-tc-m-7129
// *
// */
//@EnableAutoConfiguration(exclude={RabbitAutoConfiguration.class})
//@ComponentScan("com.my.springboot.ConditionalOnMissingBean,bean")
//public class HelloWorldMainApplication {
//
//    public static void main(String[] args) {
//
//    	ConfigurableApplicationContext context = SpringApplication.run(HelloWorldMainApplication.class,args);
//    	System.out.println("------"+context.getBean(MyBean.class));
//    	System.out.println("------"+context.getBean(Person.class));
//    	System.out.println("------"+context.getBeanNamesForType(Person.class)[0]);
//    	//System.out.println("------"+context.getBean(RedisAutoConfiguration.class));
//    	/*String[] namesString = context.getBeanDefinitionNames();
//    	for (String name : namesString) {
//			System.out.println("有----------"+name);
//		}*/
//    	context.close();
//    }
//}
