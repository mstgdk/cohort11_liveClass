package map;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        //elemanların her birine entrySet denir
        //elemanlar key-value
        //key'ler benzersizdir
        //value'lar benzer olablir,
        //key-value -> null alabilir
        //sıralama rastgele
        HashMap<String,Integer> map = new HashMap<>();
        map.put("mesut",1987);
        map.put("ali",1991);
        map.put("fatma",1985);
        map.put("bahadır",1999);
        map.put("yakup",2000);
        map.put("yakup",2000);
        map.put(null,2000);
        map.put("veli",null);
        System.out.println(map);

        System.out.println("map.keySet() = " + map.keySet()); // sadece key ler alınır
        System.out.println("map.values() = " + map.values()); // value lar alınır
        System.out.println("map.get(\"fatma\") = " + map.get("fatma")); // verilken key'in value sini verir

        //remove(x)
        System.out.println("map.remove(\"fatma\") = " + map.remove("fatma"));
        System.out.println(map);

        //remove(x,y) -- silerse true döner, silemezse false
        System.out.println("map.remove(\"bahadır\",1999) = " + map.remove("bahdfdefdadır", 1999));
        System.out.println(map);

        //putIfAbsent
        map.putIfAbsent("berk", 1995);
        System.out.println("map.putIfAbsent(\"yakup\", 2000) = " + map.putIfAbsent("yakup", 2000));
        System.out.println(map);

        //containsKey -- containsValue
        System.out.println("map.containsKey(\"mesut\") = " + map.containsKey("mesut"));
        System.out.println("map.containsValue(\"1998\") = " + map.containsValue(1998));

        //replace(x,y)
        System.out.println("map.replace(\"mesut\",2000) = " + map.replace("mesut", 2000));//1987
        System.out.println("map.replace(\"mehmet\",2000) = " + map.replace("mehmet", 2000));//null
        System.out.println(map);

        //getOrDefault()
        System.out.println("map.getOrDefault(\"berk\",999999) = " + map.getOrDefault("berk", 999999));
        System.out.println("map.getOrDefault(\"hasan\",456) = " + map.getOrDefault("hasan", 456));
        System.out.println(map);

        //map -> list'e çevirme
        List<String> names = new ArrayList<>(map.keySet());
        List<Integer> years = new ArrayList<>(map.values());
        System.out.println(names);
        System.out.println(years);

        //entrySet -- map in tüm elemanlarını set in içinbe atar
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        System.out.println("entries = " + entries);
        for (Map.Entry<String,Integer>  w : entries){
            System.out.println("w.getKey() = " + w.getKey());
            System.out.println("w.getValue() = " + w.getValue());

        }



    }
}
