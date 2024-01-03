package com.learn.Spring.SpringPjrt1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("Configuration.xml");
    	Student std=(Student)ctx.getBean("st");
    	System.out.println(std);
    	JavaTeacher JTR=(JavaTeacher)ctx.getBean("JT");
    	System.out.println(JTR);
    	SQLTeacher STR=(SQLTeacher)ctx.getBean("ST");
    	System.out.println(STR);
    	PythonTeacher PTR=(PythonTeacher)ctx.getBean("PT");
    	System.out.println(PTR);
        
    }
}
