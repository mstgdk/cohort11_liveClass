package oop.abstraction;

public abstract class Animal {
    //abstract metot -> body si olmayan metot
    //abstract metotlar yalnızca abstaract class içinde olur

    //abstract metot
    public abstract void run();

    //concrete metot
    public void eat(){
        System.out.println("eat metot çalıştı");
    }
}
