package map;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        //key elamanı null değer alamaz
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("mesut",1987);
        map.put("ali",1991);
        map.put("fatma",1985);
        map.put("bahadır",1999);
        map.put("yakup",2000);
        map.put("yakup",2000);
        //map.put(null,2000);
        map.put("veli",null);
        System.out.println(map);

        //firstKey - lastKey()
        System.out.println("map.firstKey() = " + map.firstKey());
        System.out.println("map.lastKey() = " + map.lastKey());

        //headMap -- belirtilen keyden önceki keyleri ve değerlerini verirr
        System.out.println("map.headMap(\"fatma\") = " + map.headMap("fatma"));

        //tailMap -- headMAp in tam tersi
        System.out.println("map.tailMap(\"fatma\") = " + map.tailMap("fatma"));

        //subMap()
        System.out.println("map.subMap(\"bahadır\",\"veli\") = " + map.subMap("bahadır", "veli"));

        //descendinMap
        System.out.println("map.descendingMap() = " + map.descendingMap());

        //higherKey() --  lowerKey()
        System.out.println("map.higherKey(\"fatma\") = " + map.higherKey("fatma"));
        System.out.println("map.lowerKey(\"fatma\") = " + map.lowerKey("fatma"));
    }
}
