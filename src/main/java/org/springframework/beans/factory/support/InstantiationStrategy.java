package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/*
* bean的实例化策略
* */
public interface InstantiationStrategy {
	Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
