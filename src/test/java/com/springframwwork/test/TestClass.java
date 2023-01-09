package com.springframwwork.test;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.springframework.beans.factory.BeanFactory;


public class TestClass {

	@org.junit.Test
	public void testGetBean() throws Exception {
		BeanFactory beanFactory = new BeanFactory();
		beanFactory.registerBean("helloService", new HelloService());
		HelloService helloService = (HelloService) beanFactory.getBean("helloService");

		assertThat(helloService).isNotNull();
		assertThat(helloService.sayHello()).isEqualTo("hello");

		System.out.println(helloService.sayHello());
	}
}

class HelloService {
	public String sayHello() {
		return "hello";
	}
}
