package com.my.springboot.loadProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
//加载多个外部资源文件方式一:
//@PropertySource(value="classpath:other.properties")
//@PropertySource(value="classpath:other2.properties")

//加载多个外部资源文件方式一:
//@PropertySources(
//		          {@PropertySource(value="classpath:other.properties"),
//	              @PropertySource(value="classpath:other2.properties")})

//这种方式不支持，参数上有备注:each location must evaluate to exactly one {@code .properties} resource
@PropertySource("{classpath:other.properties")

@ConfigurationProperties(prefix="my.person")
public class Person2 {
	private String name;
	
	private String ha;
	
	private String ni;
	
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

	public String getHa() {
		return ha;
	}

	public void setHa(String ha) {
		this.ha = ha;
	}

	public String getNi() {
		return ni;
	}

	public void setNi(String ni) {
		this.ni = ni;
	}
	
}
