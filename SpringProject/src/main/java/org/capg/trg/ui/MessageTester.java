package org.capg.trg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.trg.model.Message;

public class MessageTester {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("message.xml");
		Message message=(Message) context.getBean("messageBean");
		System.out.println(message.getMessage1());
		System.out.println(message.getMessage2());
		System.out.println(message.getMessage3());
	
		((AbstractApplicationContext)context).registerShutdownHook();

	}

}
