package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        //eleman ekleme ve silme işlemlerinde başarılıdır
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);

        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(12);
        list.add(3);
        list.add(3);
        list.add(3);
        System.out.println("list = " + list);

        //addFirst -- addLast
        list.addFirst(0);
        list.addLast(99);
        System.out.println("list = " + list);

        //getFirst - getLast()
        System.out.println("list.getFirst() = " + list.getFirst());
        System.out.println("list.getLast() = " + list.getLast());

        list.set(3,77);
        System.out.println("list = " + list);
    }
}
