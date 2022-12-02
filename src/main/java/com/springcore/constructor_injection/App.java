package com.springcore.constructor_injection;

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
        			
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor_injection/ciconfig.xml");
        
        person s1	=(person) context.getBean("PersonBean");

        
        System.out.println(s1);
        
        
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);		
        
    }
}
