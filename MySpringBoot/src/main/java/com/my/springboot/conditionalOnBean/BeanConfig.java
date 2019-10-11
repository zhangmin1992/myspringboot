package com.my.springboot.conditionalOnBean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class BeanConfig {

	@ConditionalOnBean(TairClientProperties.class)
	@Bean
	public GetTairClientProperties getTairClientProperties(TairClientProperties tairClientProperties) {
		return new GetTairClientProperties(tairClientProperties);
	}
}
