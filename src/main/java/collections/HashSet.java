package collections;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        //tekarsız data tutuyor
        //rastgele sıralama
        Set<String> set = new java.util.HashSet<>();
        set.add("mesut");
        set.add("ali");
        set.add("bahadır");
        set.add("yakup");
        set.add("fatma");
        set.add("fatma");
        set.add("fatma");

        System.out.println(set);



    }
}
