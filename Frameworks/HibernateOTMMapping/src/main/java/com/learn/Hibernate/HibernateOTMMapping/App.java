package com.learn.Hibernate.HibernateOTMMapping;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();  
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        ArrayList<Technology> list1=new ArrayList<Technology>();
        ArrayList<Technology> list2=new ArrayList<Technology>();
        ArrayList<Technology> list3=new ArrayList<Technology>();
        
        Technology t1=new Technology(123,"Java");
        Technology t2=new Technology(124,"HTML");
        Technology t3=new Technology(125,"CSS");
        Technology t4=new Technology(126,"SQL");
        list1.add(t1);
        list1.add(t2);
        
        list2.add(t1);
        list2.add(t2);
        list2.add(t3);
        list2.add(t4);
        
        list3.add(t4);
        list3.add(t1);
        SoftwareEng se1=new SoftwareEng(1,"Sumit",29,list1);
        SoftwareEng se2=new SoftwareEng(2,"Sourav",30,list2);
        SoftwareEng se3=new SoftwareEng(3,"Sachin",28,list3);
        session.save(se1);
        session.save(se2);
        session.save(se3);
        session.save(t1);
        session.save(t2);
        session.save(t3);
        session.save(t4);
        tr.commit();
        System.out.println("Storing Completed");
    }
}
