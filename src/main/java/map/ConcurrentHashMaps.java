package map;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMaps {
    public static void main(String[] args) {

        /*
        Özellikleri hashMap ile aynı ancak farkı: thread safe
         */
        Map<String,Integer> map = new ConcurrentHashMap<>();
        map.put("mesut",1987);
        map.put("ali",1991);
        map.put("fatma",1985);
        map.put("bahadır",1999);
        map.put("yakup",2000);
        map.put("yakup",2000);
        System.out.println(map);

    }
}
