package com.st;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion; 
import org.springframework.beans.factory.xml.XmlBeanDefinitionStoreException;
public class Test 
{

	public static void main(String[] args) 
	{
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
		    
		      
		   Employee emp=(Employee)context.getBean("empbean");  
		    emp.displayInfo();
		System.out.println("version: " + SpringVersion.getVersion());
		
	}

}
