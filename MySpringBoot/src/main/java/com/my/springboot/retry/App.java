package com.my.springboot.retry;

import java.io.IOException;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;

@ComponentScan("com.my.springboot.retry")
@SpringBootApplication
@EnableRetry
public class App {
	
	public static void main(String[] args) throws IOException {
		System.out.println(new Random().nextInt(10));
		ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class, args);
		RetryService retryService = applicationContext.getBean(RetryService.class);
		try {
			System.out.println(retryService.minGoodsnum(3333L));
		} catch (Exception e) {
			System.out.println("App----" + e.getMessage());
		}
	}

}
