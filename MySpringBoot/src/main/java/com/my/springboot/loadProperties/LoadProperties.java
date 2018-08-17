package com.my.springboot.loadProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoadProperties {

	@Autowired
	private Person person;
	
	private String name = person.getName();
	
	private Integer age = person.getAge();
	
	public void show(){
		System.out.println(this.name + "----" + this.age);
	}
}
