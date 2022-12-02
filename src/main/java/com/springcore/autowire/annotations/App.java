package com.springcore.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        			
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotations/config.xml");
        
        employee s1	=(employee) context.getBean("employeebean");
        System.out.println(s1);
        
        
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);		
        
    }
}
