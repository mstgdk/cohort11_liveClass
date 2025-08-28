package lambda_stream.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream03 {
    //distinct
    //TASK-1: List elemanlarını alfabetik, büyük harf ve tekrarsız print ediniz
    public static void printNames1(ArrayList<String> list) {
        list.stream()
                .map(String::toUpperCase)
                //.sorted(Comparator.reverseOrder())
                //.sorted()
                .distinct()
                .forEach(Stream01::yazdir);
    }
    //collect
    //Yukarıdaki metodun sonucunu bir list'e aktarınız
    public static List<String> printNames2(ArrayList<String> list) {
      return  list.stream()
                .map(String::toUpperCase)
                //.sorted(Comparator.reverseOrder())
                .sorted()
                .distinct()
                //.collect(Collectors.toList());
              .toList();
    }
    // *********************** anyMatch() *** allMatch() **** noneMatch() ************************
    //anyMatch() --> en az bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    // Task-4 : List elelmmalarinin hepsinin karakter sayisinin 4 ve 4 'den az olma durumunu kontrol ediniz.
    public static void allMatch(ArrayList<String> list){
        System.out.println(list.stream().allMatch(t -> t.length() > 2));
    }
    // Task-5 : List elelmanlarinin hiç birinin "w" ile başlamadığını noneMatch() ile kontrol ediniz.
    public static void noneMatch(ArrayList<String> list){
        System.out.println(list.stream().noneMatch(t->t.startsWith("w")));
    }
    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
    public static void anyMatch(ArrayList<String> list){
        System.out.println(list.stream().anyMatch(t->t.endsWith("x")));
    }
    //limit
    public static void limit(ArrayList<String> list){
        list.stream().limit(3).forEach(Stream01::yazdir);
    }
    //count
    public static void count(ArrayList<String> list){
        System.out.println(list.stream().count());
    }
    //skip
    public static void skip(ArrayList<String> list){
        list.stream().skip(2).forEach(Stream01::yazdir);
    }



}
