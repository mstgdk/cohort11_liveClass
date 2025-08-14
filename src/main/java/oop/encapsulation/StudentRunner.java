package oop.encapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("mesut");
        st1.setNumber(123);
        System.out.println("st1.getName() = " + st1.getName());

        Student st2 = new Student("ali");
        System.out.println("st2.getName() = " + st2.getName());

        /*
        private
        default
        protected
        puplic
         */

    }
}
