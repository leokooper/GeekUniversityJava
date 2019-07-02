package ru.leonchenko.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


/**
 * @author Igor Leonchenko
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Marks.class)
                .buildSessionFactory();

        Session session = null;

        //Add new student
//        session = factory.getCurrentSession();
//        Student tmpStudent = new Student();
//        tmpStudent.setFirst_name("Ivan");
//        tmpStudent.setLast_name("Ivanov");
//        session.beginTransaction();
//        session.save(tmpStudent);
//        session.getTransaction().commit();

        //Delete student where serialization=id
//        session = factory.getCurrentSession();
//        session.beginTransaction();
//        Student student = session.get(Student.class,1);
//        session.delete(student);
//        session.getTransaction().commit();

        //Get all books from schema
//        session = factory.getCurrentSession();
//        session.beginTransaction();
//        List<Student> students = session.createQuery("from Student").getResultList();//берем данные из объекта
//        List<Student> students = session.createQuery("from Student s where s.first_name = :first_name")
//                .setParameter("first_name", "Ivan").getResultList();
//        System.out.println(students);
//        session.getTransaction().commit();

        //Get student by id
//        session = factory.getCurrentSession();
//        session.beginTransaction();
//        Student student = session.get(Student.class,1);
//        System.out.println(student);
//        session.getTransaction().commit();


//        session = factory.getCurrentSession();
//        session.beginTransaction();
//        Course course = session.get(Course.class,1);
//        System.out.println(course);
//        session.getTransaction().commit();

//        session = factory.getCurrentSession();
//        session.beginTransaction();
//        Course course = session.get(Course.class,1);
//        System.out.println(course);
//        session.getTransaction().commit();

        session = factory.getCurrentSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("from Student").getResultList();
        System.out.println(students);
        session.getTransaction().commit();


    }
}
