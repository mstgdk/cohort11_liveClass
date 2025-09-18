package hibernate.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {
    public static void main(String[] args) {
        Computer01 c1 = new Computer01(1L, "abc", "def");
        Computer01 c2 = new Computer01(2L, "adsef", "def");
        Computer01 c3 = new Computer01(3L, "hth", "dghtref");

        Student01 s1 = new Student01(1L, 123, "mesut");
        Student01 s2 = new Student01(2L, 456, "ali");
        Student01 s3 = new Student01(3L, 789, "kerem");
        Student01 s4 = new Student01(4L, 584, "erdem");

        s1.setComputer(c1);
        s2.setComputer(c3);
        s4.setComputer(c2);
        //s3.setComputer(c2);
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student01.class)
                .addAnnotatedClass(Computer01.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();
        session.persist(c1);
        session.persist(c2);
        session.persist(c3);
        session.persist(s1);
        session.persist(s2);
        session.persist(s3);
        session.persist(s4);

        session.getTransaction().commit();
        session.close();
    }
}
