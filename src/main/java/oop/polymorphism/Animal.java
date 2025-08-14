package oop.polymorphism;

public class Animal {
    //overriding
    //overloading
    //private, static ya da final metotlar override edilemez
    public void breath(){
        System.out.println("breath metot çalıştı");
    }
    public final void run(){
        System.out.println("run metot çalıştı");
    }
}
