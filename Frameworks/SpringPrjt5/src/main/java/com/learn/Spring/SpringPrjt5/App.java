package com.learn.Spring.SpringPrjt5;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
    	Mobile mb1=(Mobile)ctx.getBean("M1");
    	Mobile mb2=(Mobile)ctx.getBean("M2");
    	Mobile mb3=(Mobile)ctx.getBean("M3");
    	Person emp1=(Person)ctx.getBean("P1");
    	Person emp2=(Person)ctx.getBean("P2");
    	Person emp3=(Person)ctx.getBean("P3");
        System.out.println(mb1);
        System.out.println(mb2);
        System.out.println(mb3);
        System.out.println("----------------------------------------------------------");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        ctx.close();
    }
}
