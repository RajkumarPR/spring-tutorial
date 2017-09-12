package com.spring.learn.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MainSpring {

	public static void main(String []args) {



        /* BeanFactory factory = new XmlBeanFactory(new FileSystemResource("C:\\Users\\rraigonde\\Documents\\workspace-sts-3.9.0.RELEASE\\HelloWorld\\src\\main\\resources\\spring.xml"));

        HelloWorld helloWorld = (HelloWorld) factory.getBean("helloworld");

        System.out.println(helloWorld.getMessage()); */

        /**
         *  API ClassPathXmlApplicationContext() loads beans configuration i.e. spring.xml. It takes care of creating
         *  and initializing all the objects i.e. beans mentioned in the configuration file.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        HelloWorld hello = (HelloWorld) context.getBean("helloworld");

        System.out.println(hello.getMessage());
    }
}
