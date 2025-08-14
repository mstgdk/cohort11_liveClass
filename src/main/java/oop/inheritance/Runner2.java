package oop.inheritance;

public class Runner2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("cat.name = " + cat.name);

        //VARIABLE CALL
        // inheritance'da variable, oluşturulan objenin data tipinin ait olduğu classdan alınır
        Mammal cat2 = new Cat();
        System.out.println("cat2.name = " + cat2.name);

        Animal cat3 = new Cat();
        System.out.println("cat3.name = " + cat3.name);

        //METHOD CALL
        //objenin construtor'ının ait olduğu classdan alınır
        Cat cat4 = new Cat();
        cat4.drink();
        cat4.breath();

        Animal cat5 = new Mammal();
        cat5.breath();



    }
}
