package collections;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        //giriş sırasına göre eleman ekler
        //HashSet'lere göre daha yavaştır
        LinkedHashSet<String> lHashSet = new LinkedHashSet<>();
        lHashSet.add("mesut");
        lHashSet.add("ali");
        lHashSet.add("bahadır");
        lHashSet.add("yakup");
        lHashSet.add("fatma");
        lHashSet.add("fatma");
        lHashSet.add("fatma");
        System.out.println(lHashSet);
    }
}
