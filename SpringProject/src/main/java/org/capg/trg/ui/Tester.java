package org.capg.trg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.trg.model.HelloWorld;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("test.xml");
		HelloWorld obj1=(HelloWorld) context.getBean("helloWorldBean");
		System.out.println(obj1.getMessage());
		/*HelloWorld obj2=(HelloWorld) context.getBean("helloWorldBean");
		System.out.println(obj1.hashCode() + " " +obj2.hashCode());
		System.out.println(obj1+" "+obj2);*/
		((AbstractApplicationContext)context).registerShutdownHook();
	}

}
