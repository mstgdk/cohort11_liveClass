package hibernate.oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(House01.class)
                .addAnnotatedClass(Room01.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        House01 house = session.get(House01.class, 2);
        System.out.println(house);


        session.getTransaction().commit();
        session.close();
    }
}
