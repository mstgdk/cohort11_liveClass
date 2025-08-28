package lambda_stream.streams;

import java.util.ArrayList;

public class Stream01 {
    public static void printNumbers(ArrayList<Integer> list){
        for (Integer a : list){
            System.out.print(a +" ");
        }

    }
    //forEach()
    public static void printNumbers2(ArrayList<Integer> list){
       list.stream().forEach(t-> System.out.print(t+" "));
    }
    public static void printNumbers3(ArrayList<Integer> list){
        list.stream().forEach(System.out::print);//method referance
    }
    public static void yazdir(int a){
        System.out.print(a+" ");
    }
    public static void yazdir(String a){
        System.out.print(a+" ");
    }
    public static void printNumbers4(ArrayList<Integer> list){
        list.stream().forEach(Stream01::yazdir);//method referance
    }
    //filter
    //TASK-1: StreamAPI ile list elemanlarinin  cift olanlarını aynı
    // satırda aralarına boşluk bırakarak print ediniz.
    public static void printNumbers5(ArrayList<Integer> list){
        list.stream().filter(t->t%2==0).forEach(Stream01::yazdir);
    }

    public static void printNumbers6(ArrayList<Integer> list){
        list.stream().filter(t->t%2==0 && t>5).forEach(Stream01::yazdir);
    }

}
