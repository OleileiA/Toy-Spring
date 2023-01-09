package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

public interface BeanFactory {

	/*
	* 获取bean
	* 当bean不存在时候抛出异常
	* */
	Object getBean(String name) throws BeansException;
}
