package com.my.springboot.retry;

import org.springframework.stereotype.Service;

@Service
public class FundService {

	public String getFundDetail(long orderId,int times) {
		if(times == 2) {
			System.out.println("FundService 我获取到请求 orderId:"+orderId);
			return "hello"+orderId;
		}else {
			return null;
		}
	}
}
