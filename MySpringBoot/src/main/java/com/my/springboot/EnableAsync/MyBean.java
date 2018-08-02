package com.my.springboot.EnableAsync;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

	@Async
	public void show() {
		for(int i=0;i<10;i++) {
			try {
				System.out.println("------"+i+"------");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
