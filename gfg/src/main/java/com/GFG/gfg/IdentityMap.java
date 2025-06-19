package com.GFG.gfg;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        String s1 = new String("Key");
        String s2 = new String("Key");
        map.put(s1,1);
        map.put(s2,2);

        System.out.println(map);

        Map<String,Integer> map2 = new IdentityHashMap<>();
        map2.put(s1,1);
        map2.put(s2,2);
        System.out.println(map2);

    }
}
