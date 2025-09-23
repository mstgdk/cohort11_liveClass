package hibernate.oneToMany;

import hibernate.oneToOne.Computer01;
import hibernate.oneToOne.Student01;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {
    public static void main(String[] args) {
        House01 h1 = new House01(120);
        House01 h2 = new House01(100);
        House01 h3 = new House01(85);

        Room01 r1 = new Room01("blue");
        Room01 r2 = new Room01("black");
        Room01 r3 = new Room01("green");
        Room01 r4 = new Room01("white");
        Room01 r5 = new Room01("blue");
        Room01 r6 = new Room01("blue");


        h1.getRooms().add(r1);
        h1.getRooms().add(r2);
        h1.getRooms().add(r3);
        h2.getRooms().add(r4);
        h2.getRooms().add(r5);
        h3.getRooms().add(r6);




        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(House01.class)
                .addAnnotatedClass(Room01.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        session.persist(h1);
        session.persist(h2);
        session.persist(h3);
        session.persist(r1);
        session.persist(r2);
        session.persist(r3);
        session.persist(r4);
        session.persist(r5);
        session.persist(r6);


        session.getTransaction().commit();
        session.close();
    }
}
