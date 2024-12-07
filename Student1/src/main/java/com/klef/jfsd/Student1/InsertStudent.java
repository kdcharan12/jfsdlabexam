package com.klef.jfsd.Student1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {

    public static void main(String[] args) {
        Student student = new Student();
        student.setS_id(98);
        student.setS_name("charan");
        student.setS_loc("Vijayawada");
        student.setS_hod_name("srk");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();
        factory.close();
    }
}
