package com.GFG.gfg;

import java.util.*;

public class ListPractice{
    public static void main(String[] args){
        System.out.println("Start");
        System.out.println("Creating list");
        List<Integer> list = new ArrayList<>();
        System.out.println("Adding elements to list");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        System.out.println("Removing elements from list");
        list.remove(2);  //removes value at index 2
        System.out.println(list);
        list.remove(Integer.valueOf(2));  //removes value 2 -> object 2
        System.out.println(list);

        //adds value at index 2
        System.out.println("Adding value at index 2");
        list.add(2,10);  
        System.out.println(list);

        System.out.println("Getting value at index 2");
        System.out.println(list.get(2));

        System.out.println("Setting value at index 2");
        list.set(2,20);  //sets value at index 2
        System.out.println(list);

        System.out.println("Checking if list is empty");
        System.out.println(list.isEmpty());

        System.out.println("Checking if list contains 20");
        System.out.println(list.contains(20));

        System.out.println("Checking if list contains 21");
        System.out.println(list.contains(21));

        System.out.println("Creating list from Array");
        Integer[] arr = {1,2,3,4,5};
        List<Integer> list2 = Arrays.asList(arr);
        System.out.println(list2);
        
        System.out.println("List 1 and list 2 are objects of different classes");
        System.out.println(list.getClass().getName());
        System.out.println(list2.getClass().getName());
        System.out.println("Adding or removing elements from list 2 will throw an error");
        // list2.add(6);
        // list2.remove(2);
        list2.set(2,20);
        list2.replaceAll(e -> e*2);
        System.out.println(list2);

        System.out.println("Creating list using of method");
        List<Integer> list3  =  List.of(1,2,3,4,5);
        System.out.println(list3);
        System.out.println("Adding or removing elements from list 3 will throw an error");
        // list3.add(6);
        // list3.remove(2);
        // list3.set(2,20);
        // list3.replaceAll(e -> e*2);
        System.out.println(list3);

        System.out.println("Creating list of size 10");
        List<Integer> list4 = new ArrayList<>(10);
        System.out.println(list4);
 
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        Object[] array2 = list.toArray();
        System.out.println(Arrays.toString(array2));
        
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
        
        
    }
}