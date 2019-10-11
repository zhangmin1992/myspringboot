//package com.my.springboot.EnableAutoConfiguration;
//
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
//import bean.Car;
//
//
///**
// *  自动配置功能源码分析
// *  功能1:@EnableAutoConfiguration + @ComponentScan 的情况下可以自定注入@Component 标记的bean
// *  功能2:@EnableAutoConfiguration + rabitma的pom依赖，就可以在容器中自动注入bean->RabbitAutoConfiguration
// *  
// *  关键实现点1:AutoConfigurationImportSelector 中的 selectImports 接口的返回值会被注册到spring容器中
// *          2:AutoConfigurationImportSelector 中的 getCandidateConfigurations 会将 META-INF/spring.factories 中定义的 属性读取并返回
// *  
// *  功能3:按照类型或者按照beaname排除指定的bean，注意要排除的bean只能是被springboot自定注入的bean而不是@ComponentScan标记的自定义bean
// */         
//@EnableAutoConfiguration
////@EnableAutoConfiguration(exclude={RabbitAutoConfiguration.class})
//
//@ComponentScan(value="{com.my.springboot.EnableAutoConfiguration,bean}")
//public class HelloWorldMainApplication {
//
//    public static void main(String[] args) {
//
//    	ConfigurableApplicationContext context = SpringApplication.run(HelloWorldMainApplication.class,args);
//    	System.out.println("---"+context.getBean(MyBean.class));
//    	System.out.println("---"+context.getBean(Car.class));
//    	System.out.println("容器中bean的个数是"+context.getBeanDefinitionCount());
//    	/*String[] namesString = context.getBeanNamesForType(RabbitAutoConfiguration.class);
//    	for (String name : namesString) {
//			System.out.println("----------"+name);
//		}*/
//    	context.close();
//    }
//}
