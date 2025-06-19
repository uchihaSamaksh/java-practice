package com.GFG.gfg;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Jim", 35);
        System.out.println(map);

        Map<String, Integer> map2 = new LinkedHashMap<>(16, 0.75f, true);
        map2.put("John", 25);
        map2.put("Jane", 30);
        map2.put("Jim", 35);
        System.out.println(map2);

        map2.get("Jane");
        System.out.println(map2);

        
        
    }

    // @Override
    // public boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
    //     return size() > 3;
    // }
}
