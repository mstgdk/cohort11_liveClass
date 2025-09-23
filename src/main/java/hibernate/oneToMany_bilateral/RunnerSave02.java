package hibernate.oneToMany_bilateral;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerSave02 {
    public static void main(String[] args) {
        House02 h1 = new House02(120);
        House02 h2 = new House02(100);
        House02 h3 = new House02(85);

        Room02 r1 = new Room02("blue");
        Room02 r2 = new Room02("black");
        Room02 r3 = new Room02("green");
        Room02 r4 = new Room02("white");
        Room02 r5 = new Room02("blue");
        Room02 r6 = new Room02("blue");


        /*h1.getRooms().add(r1);
        h1.getRooms().add(r2);
        h1.getRooms().add(r3);
        h2.getRooms().add(r4);
        h2.getRooms().add(r5);
        h3.getRooms().add(r6);*/

        /*
        owingSide - sahip
        inverse side - karşı taraf
         */
        r1.setHouse02(h1);
        r2.setHouse02(h1);
        r3.setHouse02(h1);
        r4.setHouse02(h2);
        r5.setHouse02(h3);
        r6.setHouse02(h2);




        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(House02.class)
                .addAnnotatedClass(Room02.class)
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
