package hibernate.manyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Doctor.class)
                .addAnnotatedClass(Patient.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        Doctor doctor = session.get(Doctor.class,2);
        System.out.println(doctor);


        session.getTransaction().commit();
        session.close();
    }
}
