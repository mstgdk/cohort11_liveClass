package oop.polymorphism;

public class Cat extends Animal {
    //inheritance şart
    //method signiture'a dokunulmaz, body değiştirilir
    @Override
    public void breath() {
        System.out.println("child classs daki breath çalıştı");
    }


}
