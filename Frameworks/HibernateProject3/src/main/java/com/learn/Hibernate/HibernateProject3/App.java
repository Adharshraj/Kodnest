package com.learn.Hibernate.HibernateProject3;

import java.util.Scanner;

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
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter No of persons");
        int no=scan.nextInt();
        for(int i=0;i<=no-1;i++) {
        Person pr=new Person(scan.nextInt(),scan.next(),scan.nextInt());
        Bike bk=new Bike(scan.nextInt(),scan.next(),scan.nextInt());
        session.save(pr);
        session.save(bk);
        }
        tr.commit();
        
        System.out.println("Student object created and saved");
    }
}
