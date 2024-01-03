package com.learn.Spring.SpringPrjt2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        Laptop lt1=(Laptop)ctx.getBean("L1");
        Laptop lt2=(Laptop)ctx.getBean("L2");
        System.out.println(lt1);
        System.out.println(lt2);
        ctx.close();
    }
}
