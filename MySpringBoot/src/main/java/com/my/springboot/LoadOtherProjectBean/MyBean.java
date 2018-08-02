package com.my.springboot.LoadOtherProjectBean;

import org.springframework.stereotype.Component;

import bean.Car;
import bean.Person;

@Component
public class MyBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void show(Car car) {
		System.out.println("-------mybean-----show()----");
		Person person = new Person();
		person.show(car);
	}
	
}
