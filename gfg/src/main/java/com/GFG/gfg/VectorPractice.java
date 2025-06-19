package com.GFG.gfg;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println("Vector: "+ vector);
        vector.remove(2);
        System.out.println("Vector after removing element at index 2: "+ vector);
        vector.set(2, 5);
        System.out.println("Vector after setting element at index 2 to 5: "+ vector);
        System.out.println("Element at index 2: "+ vector.get(2));
        
        Vector<Integer> vector2 = new Vector<>(5,3);
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);
        vector2.add(5);
        System.out.println("Vector2 capacity: "+ vector2.capacity());
        vector2.add(6);
        System.out.println("Vector2 capacity after adding 6: "+ vector2.capacity());
        
        
    }
}
