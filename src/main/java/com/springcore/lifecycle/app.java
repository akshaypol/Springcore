package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.constructor_injection.person;

public class app {
	
	
    public static void main( String[] args )
    {
        			
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
        //registring shutdown look to call destroy method 	
//        regsiterhook is abstracting from AbstractApplicationContext class 
        
        context.registerShutdownHook();
//        Samosa s1	=(Samosa) context.getBean("s1");
//        coke s2	=(coke) context.getBean("s2");
        
        example s3	=(example) context.getBean("s3");
//        System.out.println(s1);
        
        System.out.println("################################");
     
//        System.out.println(s2);
        
        System.out.println("################################");
        
        System.out.println(s3);
        
    }
	
	

}
