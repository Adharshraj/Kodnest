package com.learn.Hibernate.HibernateMTM2Mapping;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
        ArrayList<SoftwareEng> list1=new ArrayList<SoftwareEng>();
        ArrayList<SoftwareEng> list2=new ArrayList<SoftwareEng>();
        ArrayList<SoftwareEng> list3=new ArrayList<SoftwareEng>();
        ArrayList<SoftwareEng> list4=new ArrayList<SoftwareEng>();
        ArrayList<Technology> li1=new ArrayList<Technology>();
        ArrayList<Technology> li2=new ArrayList<Technology>();
        ArrayList<Technology> li3=new ArrayList<Technology>();
        SoftwareEng se1=new SoftwareEng();
        SoftwareEng se2=new SoftwareEng();
        SoftwareEng se3=new SoftwareEng();
        Technology t1=new Technology();
        Technology t2=new Technology();
        Technology t3=new Technology();
        Technology t4=new Technology();
        t1.setT_id(123);
        t1.setT_name("Java");
        t2.setT_id(124);
        t2.setT_name("HTML");
        t3.setT_id(125);
        t3.setT_name("CSS");
        t4.setT_id(126);
        t4.setT_name("SQL");
        se1.setId(1);
        se1.setName("Sumit");
        se1.setAge(29);
        
        se2.setId(2);
        se2.setName("Sourave");
        se2.setAge(30);
        se2.setTech(li2);
        se3.setId(3);
        se3.setName("Sachin");
        se3.setAge(28);
        se3.setTech(li3);
        list1.add(se1);
        list1.add(se2);
        list1.add(se3);
        list2.add(se1);
        list2.add(se2);
        list3.add(se2);
        list4.add(se2);
        list4.add(se3);
        li1.add(t1);
        li1.add(t2);
        li2.add(t1);
        li2.add(t2);
        li2.add(t3);
        li2.add(t4);
        li3.add(t1);
        li3.add(t4);
        se1.setTech(li1);
        se2.setTech(li2);
        se3.setTech(li3);
        t1.setSfte(list1);
        t2.setSfte(list2);
        t3.setSfte(list3);
        t3.setSfte(list4);
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
