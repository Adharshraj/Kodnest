package com.learn.Hibernate.HibernateOTM2Mapping;

import java.util.ArrayList;
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
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Laptop l1=new Laptop();
        Laptop l2=new Laptop();
        Laptop l3=new Laptop();
        Laptop l4=new Laptop();
        Laptop l5=new Laptop();
        Laptop l6=new Laptop();
        Laptop l7=new Laptop();
        ArrayList<Laptop> st1=new ArrayList<Laptop>();
        st1.add(l2);
        st1.add(l4);
        ArrayList<Laptop> st2=new ArrayList<Laptop>();
        st2.add(l1);
        st2.add(l3);
        st2.add(l6);
        ArrayList<Laptop> st3=new ArrayList<Laptop>();
        st3.add(l5);
        st3.add(l7);
        s1.setS_RollNo(1);
        s2.setS_RollNo(2);
        s3.setS_RollNo(3);
        s1.setS_Name("Rohit");
        s2.setS_Name("Suraj");
        s3.setS_Name("Manoj");
        l1.setL_srNo(1223);
        l2.setL_srNo(1224);
        l3.setL_srNo(1225);
        l4.setL_srNo(1226);
        l5.setL_srNo(1227);
        l6.setL_srNo(1228);
        l7.setL_srNo(1229);
        l1.setL_Brand("HP");
        l2.setL_Brand("Lenovo");
        l3.setL_Brand("Dell");
        l4.setL_Brand("Asus");
        l5.setL_Brand("Mac");
        l6.setL_Brand("Acer");
        l7.setL_Brand("Mi");
        l1.setL_st(s2);
        l2.setL_st(s1);
        l3.setL_st(s2);
        l4.setL_st(s1);
        l5.setL_st(s3);
        l6.setL_st(s2);
        l7.setL_st(s3);
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(l1);
        session.save(l2);
        session.save(l3);
        session.save(l4);
        session.save(l5);
        session.save(l6);
        session.save(l7);
        tr.commit();
        System.out.println("Loading done");
        
    }
}
