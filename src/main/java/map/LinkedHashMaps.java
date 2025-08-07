package map;

import java.util.LinkedHashMap;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("mesut",1987);
        map.put("ali",1991);
        map.put("fatma",1985);
        map.put("bahadır",1999);
        map.put("yakup",2000);
        map.put("yakup",2000);
        map.put(null,2000);
        map.put("veli",null);
        System.out.println(map);

        LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>(16,0.75f,true);
        map2.put("mesut",1987);
        map2.put("ali",1991);
        map2.put("fatma",1985);
        map2.put("bahadır",1999);
        map2.put("yakup",2000);
        map2.put("yakup",2000);
        map2.put(null,2000);
        map2.put("veli",null);
        System.out.println(map2);
        map2.get("fatma");
        map2.get("ali");
        System.out.println(map2);


    }
}
