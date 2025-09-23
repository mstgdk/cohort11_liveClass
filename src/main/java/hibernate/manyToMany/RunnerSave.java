package hibernate.manyToMany;

import hibernate.oneToMany_bilateral.House02;
import hibernate.oneToMany_bilateral.Room02;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class RunnerSave {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("KBB");
        Doctor d2 = new Doctor("GOZ");
        Doctor d3 = new Doctor("KARD");
        Doctor d4 = new Doctor("CHI");
        Doctor d5 = new Doctor("INT");
        Doctor d6 = new Doctor("KBB");

        Patient p1 = new Patient("mesut");
        Patient p2 = new Patient("ali");
        Patient p3 = new Patient("erdem");
        Patient p4 = new Patient("kerem");
        Patient p5 = new Patient("fatma");
        Patient p6 = new Patient("ayşe");

        //owingSide.set(inverseSide)
        List<Patient>patientList1 = Arrays.asList(p1,p2,p3);
        List<Patient>patientList2 = Arrays.asList(p1,p3,p4);
        List<Patient>patientList3 = Arrays.asList(p1,p5,p6);
        List<Patient>patientList4 = Arrays.asList(p2,p5,p6);
        List<Patient>patientList5 = Arrays.asList(p2,p3,p6);
        List<Patient>patientList6 = Arrays.asList(p2,p3,p6);

        d1.setPatients(patientList1);
        d2.setPatients(patientList2);
        d3.setPatients(patientList3);
        d4.setPatients(patientList4);
        d5.setPatients(patientList5);
        d6.setPatients(patientList6);

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Doctor.class)
                .addAnnotatedClass(Patient.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        session.persist(d1);
        session.persist(d2);
        session.persist(d3);
        session.persist(d4);
        session.persist(d5);
        session.persist(d6);



        session.getTransaction().commit();
        session.close();
    }
}
