package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowire.employee;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/config.xml");
	        
		  person s1	=(person) context.getBean("person1");

	        
	        System.out.println(s1);
	        
	}

}
