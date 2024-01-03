package com.learn.Hibernate.HibernateThreadOperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        //create();
        fetchData();
        //updateData();
        //deleteData();
    }
    public static void create() {
    	Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        Person pr=new Person(11,"Sumit",25,"sumit@gmail.com",9854632175l);
        Person pr1=new Person(12,"Saurav",28,"saurav@gmail.com",98546856421l);
        session.save(pr);
        session.save(pr1);
        tr.commit();
    }
    public static void fetchData() {
    	Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        Person pr=session.get(Person.class, 11);
        tr.commit();
        System.out.println(pr);
    }
}
