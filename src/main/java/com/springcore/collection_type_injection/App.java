package com.springcore.collection_type_injection;

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
        			
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection_type_injection/config.xml");
        
        collectionInjection s1	=(collectionInjection) context.getBean("javaCollection");

        
        System.out.println(s1);
        System.out.println(s1.getAddressList().getClass().getName());
        System.out.println(s1.getAddressSet().getClass().getName());
        
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);		
        
    }
}
