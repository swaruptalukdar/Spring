package org.capg.trg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.trg.model.HelloWorld;

public class SpringAnnotationDemo 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_annotation.xml");
		HelloWorld obj=(HelloWorld) context.getBean("helloWorld");
		System.out.println(obj.getMessage());
		
		
		((AbstractApplicationContext)context).registerShutdownHook();

	}

}
