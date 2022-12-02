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
	        System.out.println(s1.getFriendsList().getClass().getName());
	        
	        System.out.println(s1.getFees());
	        System.out.println(s1.getFees().getClass().getName());
	        
	        System.out.println("###################");
	        System.out.println(s1.getProps());
	        System.out.println(s1.getProps().getClass().getName());
	}

}
