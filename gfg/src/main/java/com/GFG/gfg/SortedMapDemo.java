package com.GFG.gfg;

import java.util.SortedMap;
import java.util.TreeMap; 

public class SortedMapDemo {
    public static void main(String[] args) {
        // If comparator return 0 then the keys are considered to be duplicate
        SortedMap<String,Integer> map = new TreeMap<>((a,b) -> b.length() - a.length());
        //SortedMap<String,Integer> map = new TreeMap<>();
        map.put("John",25);
        map.put("Jane",30);
        map.put("Jim",35);
        map.put("Jill",40);
        map.put("Jack",45);
        System.out.println(map);

        SortedMap<String,Integer> subMap = map.subMap("Jane","Jim");
        System.out.println(subMap);

        SortedMap<String,Integer> headMap = map.headMap("Jim");
        System.out.println(headMap);

        SortedMap<String,Integer> tailMap = map.tailMap("Jim"); 
        System.out.println(tailMap);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.comparator());
    }
}
