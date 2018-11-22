package com.wen.springdemo_1.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wen.springdemo_1.hello.HelloWorld;
import com.wen.springdemo_1.hello.HelloWorldService;

public class HelloProgram {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
		
		HelloWorld hw = service.getHelloworld();
		
		hw.sayHello();
		
		HelloWorldService service1 = (HelloWorldService) context.getBean("helloWorldService1");
		
		HelloWorld hw1 = service1.getHelloworld();
		
		hw1.sayHello();
	}
}
