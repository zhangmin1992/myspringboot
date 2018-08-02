package com.my.springboot.ConditionalOnMissingBean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;

//@ConditionalOnClass(value={MissBean.class,Jedis.class})
@ConditionalOnMissingBean(name="{Person}")
@Configuration
public class MyBean {

}
