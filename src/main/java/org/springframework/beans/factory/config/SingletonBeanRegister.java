package org.springframework.beans.factory.config;

public interface SingletonBeanRegister {
	Object getSingleton(String beanName);
}
