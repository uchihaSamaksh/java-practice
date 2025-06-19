    package com.GFG.gfg;
import java.util.LinkedList;


public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Original list: " + list);
        list.addFirst("D");
        list.addLast("E");
        System.out.println("List after adding first and last: " + list);
        list.removeFirst();
        list.removeLast();
        System.out.println("List after removing first and last: " + list);
        list.add(2,"F");
        System.out.println("List after adding element at index 2: " + list);
        list.remove(3);
        System.out.println("List after removing element at index 3: " + list);
        list.set(2,"G");
        System.out.println("List after setting element at index 2 to G: " + list);
        System.out.println("printing node: "+ list.getFirst());
        System.out.println("printing node: "+ list.getLast());
        System.out.println("printing node: "+ list.get(2));
        System.out.println("printing node: "+ list.indexOf("F"));
        System.out.println("printing node: "+ list.lastIndexOf("F"));
        System.out.println("printing node: "+ list.contains("F"));
        System.out.println("printing node: "+ list.size());
        
        list.removeIf(x -> x.equals("A"));
        System.out.println("List after removing A: " + list);

    }
}
