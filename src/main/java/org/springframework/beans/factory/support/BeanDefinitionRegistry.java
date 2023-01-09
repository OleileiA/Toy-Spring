package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
	/**
	 * 向注册表中注BeanDefinition
	 */
	void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
