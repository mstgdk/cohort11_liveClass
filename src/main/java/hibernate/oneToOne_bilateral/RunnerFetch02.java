package hibernate.oneToOne_bilateral;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch02 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student02.class)
                .addAnnotatedClass(Computer02.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        Student02 student02 = session.get(Student02.class,2L);
       // System.out.println(student02.getComputer());

       /* Computer02 computer02 = session.get(Computer02.class, 3L);
        System.out.println(computer02.getStudent());*/

        session.remove(student02);

        session.getTransaction().commit();
        session.close();
    }
}
