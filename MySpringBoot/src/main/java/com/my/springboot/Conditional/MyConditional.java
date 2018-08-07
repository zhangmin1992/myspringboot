package com.my.springboot.Conditional;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyConditional implements ConfigurationCondition {

	@Override
	public boolean matches(ConditionContext context,
			AnnotatedTypeMetadata metadata) {
		return true;
	}

	@Override
	public ConfigurationPhase getConfigurationPhase() {
		// TODO Auto-generated method stub
		return null;
	}

}
