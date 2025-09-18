package hibernate.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student01.class)
                .addAnnotatedClass(Computer01.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        Student01 student = session.get(Student01.class,2L);
        System.out.println(student);

        Computer01 computer = session.get(Computer01.class,3L);
        System.out.println(computer);

        session.getTransaction().commit();
        session.close();
    }
}
