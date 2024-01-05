package com.learn.Spring.SpringPrjt6;

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
        Engine eng1=(Engine)ctx.getBean("eng1");
        System.out.println(eng1);
        Car ca=(Car)ctx.getBean("C1");
        System.out.println(ca);
    }
}
