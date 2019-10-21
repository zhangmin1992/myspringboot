package com.my.springboot.retry;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class RetryService {

	@Autowired
	private FundService fundService;
	
	/**
	 * 在minGoodsnum方法上加上@Retryable注解，
	 * value值表示当哪些异常的时候触发重试，
	 * maxAttempts表示最大重试次数默认为3，
	 * delay表示重试的延迟时间，
	 * multiplier表示上一次延时时间是这一次的倍数。
	 */
	@Retryable(value = Exception.class,maxAttempts = 3,backoff = @Backoff(delay = 2000,multiplier = 1.5))
    public String minGoodsnum(long orderId) throws Exception{
        int times = new Random().nextInt(10);
        System.out.println(" minGoodsnum------ "+ times);
        String string = fundService.getFundDetail(orderId,times);
        if(string == null) {
        	throw new Exception("获取不到");
        }
        return string;
    }
	
	@Recover
	public void recover(long orderId) {
		System.out.println("----" + orderId);
	}
}
