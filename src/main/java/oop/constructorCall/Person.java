package oop.constructorCall;

public class Person {
    int id;

    public Person() {
        System.out.println("person'ın default const çalıştı");
    }

    public Person(int id) {
        this.id = id;
        System.out.println("person ın tek parametreli const çalıştı");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
