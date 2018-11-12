package org.capg.trg.ui;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.trg.model.Country;
import com.capg.trg.model.HelloWorld;
import com.capg.trg.model.ICurrencyConvertor;

public class App 
{
    public static void main( String[] args )
    {
    	//@SuppressWarnings("deprecation")
    	//XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
    	
    	@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	/*HelloWorld object=(HelloWorld) context.getBean("helloWorldBean");
    	System.out.println(object.getMessage());*/
    	/*ICurrencyConvertor convertor1=(ICurrencyConvertor) context.getBean("convertorBean1");
    	System.out.println("$100 = Rs." + convertor1.dollarToRupees(100.00));
    	
    	ICurrencyConvertor convertor2=(ICurrencyConvertor) context.getBean("convertorBean2");
    	System.out.println("$100 = Rs." + convertor2.dollarToRupees(100.00));*/
    	
    	
    	Country country=(Country) context.getBean("countryBean");
    	List<String> countryList=country.getCountryList();
    	Set<String> countrySet=country.getCountrySet();
    	Map<String, String> countryMap=country.getCountryMap();
    	
    	System.out.println("\nList------------------------------------");
    	Iterator<String> iterator=countryList.iterator();
    	while(iterator.hasNext())
    	{
    		System.out.println(iterator.next());
    	}
    	System.out.println("\nList------------------------------------ lamda exp");
    	countryList.stream().forEach(System.out::println);
    	
    	System.out.println("\nList------------------------------------ lamda exp");
    	countryList.stream().forEach((s)->System.out.println(s));
    	
    	System.out.println("\nSet------------------------------------");
    	iterator=countrySet.iterator();
    	while(iterator.hasNext())
    	{
    		System.out.println(iterator.next());
    	}
    	System.out.println("\nMap------------------------------------");
    	for (Map.Entry<String, String> map : countryMap.entrySet()) 
    	{
			System.out.println(map.getKey()+ " : " +map.getValue());
		}
    	
    	((AbstractApplicationContext)context).registerShutdownHook();

    }
}
