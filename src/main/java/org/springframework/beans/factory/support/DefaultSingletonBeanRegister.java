package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.SingletonBeanRegister;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegister implements SingletonBeanRegister {

	private Map<String, Object> singletonObjects = new HashMap<>();

	@Override
	public Object getSingleton(String beanName) {
		return null;
	}

	protected void addSingleton(String beanName, Object singletonObject) {
		singletonObjects.put(beanName, singletonObject);
	}
}
