package collections;

import objectCreation.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayLists {
    //çıktı sırası girilen sıradadır. (insertion order)
    //index mantığı ile çalışır
    //eleman bulmada hızlıdır
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(5);
        System.out.println("list = " + list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(46);
        list2.add(32);
        list2.add(11);
        list2.add(88);

        //eleman çağırma
        System.out.println("list.get(1) = " + list.get(1));

        //addAll()
        list.addAll(2,list2);
        System.out.println(list);

        //size()
        System.out.println("list.size() = " + list.size());

        //set()
        list.set(2,33);
        System.out.println("list = " + list);

        //remove() -primitive yazılırsaa index, n-primitive yazılırsa eleman olarak algılar
        list.remove(2);
        System.out.println("list = " + list);

        Integer a = 9;
        list.remove(a);
        System.out.println("list = " + list);

        //contains
       boolean b = list.contains(88);
        System.out.println("b = " + b);

        //conatainAll()
        boolean b2 = list.containsAll(list2);
        System.out.println("b2 = " + b2);

        //equals()
        boolean isEqual = list.equals(list2);
        System.out.println("isEqual = " + isEqual);

        //array kullanrak eleman ekleme
        Integer[] arr = {1,2,3,5,7,8,9};
        List<Integer> list3 =new ArrayList<>(Arrays.asList(arr));
        System.out.println("list3 = " + list3);

        //indexOf -- lastIndexOf()
        System.out.println("list.indexOf(2) = " + list.indexOf(2));
        System.out.println("list.lastIndexOf(3) = " + list.lastIndexOf(3));

        //listi array e çevirme
        Integer[] arr2 = list.toArray(new Integer[list.size()]);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

        //sort
        list.sort(null);//artan
        System.out.println("list artan = " + list);

        list.sort(Comparator.reverseOrder());//azalan
        System.out.println("list azaln= " + list);

        //removeIf()
        list.removeIf(x->x>6);
        System.out.println("list = " + list);

        //sublist
        List<Integer> list4 =new ArrayList<>(Arrays.asList(arr));
        List<Integer> sub = list4.subList(2,5);//2 dahil, 5 hariç
        System.out.println("list4 = " + list4);
        System.out.println("sub = " + sub);
        sub.set(0,99);
        System.out.println("list4 = " + list4);
        System.out.println("sub = " + sub);
        //alt listte yapılan değişiklikler ana listeyi de etkiler

        //bağımsız kopya
        List<Integer> indCopy = new ArrayList<>(list4.subList(2,5));


        //clear
        list.clear();
        System.out.println("list = " + list);


    }
}
