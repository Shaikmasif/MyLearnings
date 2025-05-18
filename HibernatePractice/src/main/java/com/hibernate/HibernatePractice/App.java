package com.hibernate.HibernatePractice;

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
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Student s1 = new Student("Alex");
        Transaction txn = session.beginTransaction();
        try {
        session.save(s1);
        txn.commit();
        System.out.println("details saved.");
        }catch (Exception e) {
			// TODO: handle exception
        	txn.rollback();
        	System.out.println("exc");
		}finally {
			session.close();
			sessionFactory.close();
		}
    }
}
