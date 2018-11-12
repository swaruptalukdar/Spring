package org.capg.trg.ui;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceBundleTester {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		
		System.out.println("---------------------");
		Locale currentLocale=Locale.getDefault();
		System.out.println(currentLocale.getLanguage());
		System.out.println(currentLocale.getCountry());
		System.out.println("---------------------");
		
		//pick up from messages.properties as 3rd field is null
		String message=context.getMessage("greetings", null,null);
		System.out.println(message);
		
		System.out.println("---------------------");
		//pick up from messages_fr_FR.properties
		message=context.getMessage("greetings", null, Locale.FRANCE);
		System.out.println(message);
		System.out.println("---------------------");
		
		Locale frenchLocale=new Locale("fr","FR");
		message=context.getMessage("greetings", null, frenchLocale);
		System.out.println(message);
		System.out.println("---------------------messages_fr_FR");
		// to get name value
		ResourceBundle bundle=ResourceBundle.getBundle("messages_fr_FR",frenchLocale);
		Enumeration enumeration=bundle.getKeys();
		while (enumeration.hasMoreElements()) {
			String key = (String) enumeration.nextElement();
			System.out.println(key+"="+bundle.getObject(key));
			
		}
		
		System.out.println("---------------------messages");
		// to get name value
		bundle=ResourceBundle.getBundle("messages",Locale.getDefault());
		enumeration=bundle.getKeys();
		while (enumeration.hasMoreElements()) {
			String key = (String) enumeration.nextElement();
			System.out.println(key+"="+bundle.getObject(key));
			
		}
		
		
		((AbstractApplicationContext)context).registerShutdownHook();
	}

}
