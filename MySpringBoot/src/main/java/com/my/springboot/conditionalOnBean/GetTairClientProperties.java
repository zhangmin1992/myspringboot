package com.my.springboot.conditionalOnBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@ConditionalOnBean(TairClientProperties.class)
@Component
public class GetTairClientProperties {

	@Autowired
	private TairClientProperties tairClientProperties;
	
	public GetTairClientProperties() {
		System.out.println("GetTairClientProperties" + tairClientProperties.getLocalAppKey());
	}
	public void show() {
		System.out.println("show" + tairClientProperties.getLocalAppKey());
	}
}
