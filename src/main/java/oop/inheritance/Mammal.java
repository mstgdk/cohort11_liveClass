package oop.inheritance;

public class Mammal extends Animal{
    String name = "mammalName";

    public void drink(){
        System.out.println("mammal drinks");
    }

    public void breath(){
        System.out.println("mammal breaths");
    }
}
