package com.klef.jfsd.Student1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class ViewAllStudent {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        List<Student> students = session.createQuery("from Student").list();
        
        for (Student s : students) {
            System.out.println("ID: " + s.getS_id());
            System.out.println("Name: " + s.getS_name());
            System.out.println("Name: " + s.getS_loc());
            System.out.println("Name: " + s.getS_hod_name());
            
            
            System.out.println("-----------------------------");
        }
        
        tx.commit();
        session.close();
        factory.close();
    }
}
