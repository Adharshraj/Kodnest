package com.learn.Spring.SpringAutowiringAnnot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
    	Professor prof1=(Professor)ctx.getBean("Pr1");
        System.out.println(prof1);
        Professor prof2=(Professor)ctx.getBean("Pr2");
        System.out.println(prof2);
        Professor prof3=(Professor)ctx.getBean("Pr3");
        System.out.println(prof3);
        University uvt=(University)ctx.getBean("UNI");
        System.out.println(uvt);
    }
}
