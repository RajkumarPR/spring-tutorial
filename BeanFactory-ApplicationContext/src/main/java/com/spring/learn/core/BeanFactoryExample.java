package com.spring.learn.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class BeanFactoryExample {

	public static void main(String []args) {
		
		/**
		 * The BeanFactory holds Bean Definitions of multiple beans within itself and then instantiates the bean whenever asked for by clients.
		 * BeanFactory is able to create associations between collaborating objects as they are instantiated. 
		 * This removes the burden of configuration from bean itself and the beans client.
		 * BeanFactory also takes part in the life cycle of a bean, making calls to custom initialization and destruction methods.
		 */

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(System.getProperty("user.dir")+"/src/main/resources/spring.xml"));

		Message message = (Message)factory.getBean("msg");
		
		System.out.println(message.getMessage());
	}
}
