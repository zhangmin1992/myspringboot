package com.my.springboot.Conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(MyConditional.class)
public class MyBean {

}
