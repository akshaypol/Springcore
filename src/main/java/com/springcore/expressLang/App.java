package com.springcore.expressLang;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        			
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/expressLang/config.xml");
        
        
        Person lPersonDetails	=(Person) context.getBean("person");

        
        System.out.println(lPersonDetails);
        
   //use 
        
//        SpelExpressionParser temp = new SpelExpressionParser();
//    Expression parseExpression=  (Expression) temp.parseExpression("22-10");
//      
//      System.out.println(parseExpression);
//        
        
        

        
    }
}
