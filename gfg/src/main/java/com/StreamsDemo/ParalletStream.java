package com.StreamsDemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParalletStream {
    public static void main(String[] args) {
        
        List<Integer> list = Stream.iterate(1, x-> x+1).limit(10000000).collect(Collectors.toList());
        long start = System.currentTimeMillis();
        // List<Integer> list2 = list.stream().parallel().map(x -> x*x*x*x).toList();
        List<Integer> list2 = list.parallelStream().map(x -> x*x*x*x).toList();
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");
        // System.out.println("List2: " + list2);

        start = System.currentTimeMillis();
        List<Integer> list3 = list.stream().map(x -> x*x*x*x).toList();
        end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");
        // System.out.println("List2: " + list2);
    }
}
