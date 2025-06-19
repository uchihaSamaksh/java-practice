package com.GFG.gfg;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListPractice {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer i : list) {
            System.out.println(i);
            list.add(4);
        }

        System.out.println(list);
    }
}