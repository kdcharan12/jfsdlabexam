package com.klef.jfsd.Student1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectStudent {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Student s = (Student) session.load(Student.class, 101);
        System.out.println(s.getS_name());
        System.out.println(s.getS_loc());
        System.out.println(s.getS_hod_name());
        
        tx.commit();
        session.close();
        factory.close();
    }
}
