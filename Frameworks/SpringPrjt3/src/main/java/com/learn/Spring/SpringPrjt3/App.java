package com.learn.Spring.SpringPrjt3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        Employee empe=(Employee)ctx.getBean("Emp");
        System.out.println(empe);
        ctx.close();
    }
}
