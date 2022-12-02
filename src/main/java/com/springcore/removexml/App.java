package com.springcore.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        			
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
//        Bean Name is camal case letter as your class name 
//        if we declear conponat name above class so it will create as it bean name there is no camal case letters  
        
        Student lStudent	=(Student) context.getBean("firstStudent");

        lStudent.study();
       // System.out.println(lStudent.study());
        
        
    
        
    }
}
