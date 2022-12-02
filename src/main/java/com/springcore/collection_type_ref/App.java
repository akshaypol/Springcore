package com.springcore.collection_type_ref;

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
        			
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection_type_ref/refconfig.xml");
        
        a s1	=(a) context.getBean("aref");

        
        System.out.println(s1.getOb().getY());
        
        
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);		
        
    }
}
