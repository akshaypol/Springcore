package com.springcore.stereoType;

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
        			
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereoType/config.xml");
        
//        Bean Name is camal case letter as your class name 
//        if we declear conponat name above class so it will create as it bean name there is no camal case letters  
        
        PersonDetails lPersonDetails	=(PersonDetails) context.getBean("Ob");

        
        System.out.println(lPersonDetails);
        
        
//        collection with value anotation  we can decleare collection in xml file 
//        System.out.println(lPersonDetails.getFriendsList() );
        
//        sigleton  object by defalut its singlton
//        spring container give only one object refrance still we craete multiple object 
        
        
        System.out.println(lPersonDetails.hashCode());
        System.out.println("#############################");
        
        PersonDetails lPersonDetails2	=(PersonDetails) context.getBean("Ob");
        System.out.println(lPersonDetails2.hashCode());
//        521960438
        
   
//        System.out.println(lPersonDetails.getFriendsList().getClass().getName() );
        
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);	
        
        teacher tleacher	=(teacher) context.getBean("teacher1");
        
        System.out.println(tleacher.hashCode());
        System.out.println("#############################");
        
        teacher tleacher2	=(teacher) context.getBean("teacher1");
        System.out.println(tleacher2.hashCode());
        
    }
}
