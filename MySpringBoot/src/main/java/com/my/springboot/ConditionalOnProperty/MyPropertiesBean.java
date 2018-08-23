package com.my.springboot.ConditionalOnProperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(value="my.person.name", havingValue = "ww", matchIfMissing = true)
@Component
@ConfigurationProperties(prefix="my.person")
public class MyPropertiesBean {

	private String name;
	
	private String xiao;
	
	private String myHa;

	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMyHa() {
		return myHa;
	}

	public void setMyHa(String myHa) {
		this.myHa = myHa;
	}
}
