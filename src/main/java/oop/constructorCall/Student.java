package oop.constructorCall;

public class Student extends Person{
    String name;
    int number;

    public Student() {
        super(123);
    }

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", id=" + id +
                '}';
    }
}
