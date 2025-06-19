package com.GFG.gfg;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String,Integer> table = new Hashtable<>(10,0.75f);
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(map);

        // Concurrent operation on hash table and hash map
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                table.put("Key" + i, i);
                map.put("Key" + i, i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1000;i<2000;i++){
                table.put("Key" + i, i);
                map.put("Key" + i, i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println(table.size());
        System.err.println(map.size());
    }

}
