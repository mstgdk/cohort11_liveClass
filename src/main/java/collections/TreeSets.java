package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        //naturel order ' a göre sıralar.
        //en yavaş olan set çeşididir
        TreeSet<String> names = new TreeSet<>();
        names.add("mesut");
        names.add("ali");
        names.add("bahadır");
        names.add("yakup");
        names.add("fatma");
        names.add("fatma");
        names.add("fatma");
        System.out.println(names);

        //yavaşlık problemini ortadan kaldırmak için
        Set<String> hashSet = new HashSet<>();
        hashSet.add("mesut");
        hashSet.add("ali");
        hashSet.add("bahadır");
        hashSet.add("yakup");
        hashSet.add("fatma");

        TreeSet<String> fastTreeSet = new TreeSet<>(hashSet);
        System.out.println(fastTreeSet);

        //first() -- ilk eleman
        System.out.println("names.first() = " + names.first());

        //last() -- son elleman
        System.out.println("names.last() = " + names.last());

        //lower - higher
        System.out.println("names.lower(\"mesut\") = " + names.lower("mesut")); //mesuttan önceki elamanı verir
        System.out.println("names.higher(\"mesut\") = " + names.higher("mesut"));

        //floor -- mesut varsa onu verir, yoksa bir önceki elemanı verir
        System.out.println("names.floor(\"mesut\") = " + names.floor("mehmet"));

        //ceiling - floor un tersi
        System.out.println("names.ceiling(\"mesut\") = " + names.ceiling("mesut"));

        //headSet() -- mesutttaqn kü.ük olan elemanları veirir(mesut hariç)
        System.out.println("names.headSet(\"mesut\") = " + names.headSet("mesut"));

        //tailSet -- headSet tersi
        System.out.println("names.tailSet(\"mesut\") = " + names.tailSet("mesut"));

        //subSet(a,b) -- a'dan b'ye kadar olan elemanları verir. (b hariç)
        System.out.println("names.subSet(\"bahadır\",\"yakup\") = " + names.subSet("bahadır", "yakup"));

        //descendingSet() seti terese çevirir
        System.out.println("names.descendingSet() = " + names.descendingSet());


    }

}
