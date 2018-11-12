package org.capg.trg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.trg.model.Person;

public class PersonTester {

	public static void main(String[] args) {

    	@SuppressWarnings("resource")
    	//ApplicationContext context=new ClassPathXmlApplicationContext("person.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("person2.xml");
    	Person person1=(Person) context.getBean("personBean");
    	System.out.println(person1.getAdharCardNumber());
    	System.out.println(person1.getName());
    	System.out.println(person1.getResidentialAddress().toString());
    	System.out.println(person1.getPermanentAddress().toString());
    	((AbstractApplicationContext)context).registerShutdownHook();
	}

}
