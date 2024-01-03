package com.learn.Hibernate.HibernateProject2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();  
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        Student st=new Student(11,"Arjun",80);
        session.save(st);
        tr.commit();
        
        System.out.println("Student object created and saved");
    }
}
