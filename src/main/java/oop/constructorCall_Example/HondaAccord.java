package oop.constructorCall_Example;

public class HondaAccord extends Honda {


    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord(){

    }

    public HondaAccord(int price){
        this.price = price;
    }

    public HondaAccord(int price, int year){
        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");
    }

    public HondaAccord(int price, int year, String make, String model){
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
    }
}
