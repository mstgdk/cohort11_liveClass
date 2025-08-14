package oop.constructor;

public class StudentRunner1 {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name="mesut";
        st1.number=123;
        System.out.println("st1 = " + st1);

        Student st2 = new Student("ali");
        st2.schoolName ="XXX";
        st2.name="veli";
        System.out.println("st2 = " + st2);

        Student st3 = new Student("merve",1454,12345678,"OOP");
        System.out.println("st3 = " + st3);
    }
}
