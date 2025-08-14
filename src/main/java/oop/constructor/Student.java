package oop.constructor;

public class Student {
    //fields - alan
    //pojo -
    String name;
    int number;
    int id;
    String schoolName = "ABC";

    //constructor
    //1--default const (parametresiz const.):
    //2-- parameterized constructo (paremterli): biz parametreli cons. oluşturursak default const. ortadan kalkar


    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int number, int id, String schoolName) {
        this.name = name;
        this.number = number;
        this.id = id;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", id=" + id +
                ", schlName='" + schoolName + '\'' +
                '}';
    }
}
