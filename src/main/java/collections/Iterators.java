package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("T");
        list.add("X");
        list.add("Z");
        System.out.println(list);

        //list in her bir elemanını ! ekleyerek update ediniz
        for (String w : list){
            //w = w+"!";
            //list.remove(w);
        }
        System.out.println(list);
        //loop'lar collection'ları upodate etmekte kullanılmaz. -> Iterator
        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()){
           String el = itr.next();
           itr.set(el+"!");
        }
        System.out.println(list);
    }
}
