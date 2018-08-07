package com.my.springboot.EnableConfigurationProperties;

import org.springframework.stereotype.Component;

@Component
public class getMyPropertiesBean {

	private MyPropertiesBean myPropertiesBean;
	
	public getMyPropertiesBean(MyPropertiesBean myPropertiesBean){
		this.myPropertiesBean = myPropertiesBean;
	}
	
	public void getMyName() {
		System.out.println(myPropertiesBean.getName());
	}
}
