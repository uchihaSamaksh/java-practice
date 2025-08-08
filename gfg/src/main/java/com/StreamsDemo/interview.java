package main.java.com.StreamsDemo;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.HashMap;

public class interview {
    public static void main(String[] args) {
        Integer[] arr = {11,2,2,6,5,6,7,8,9,10};
        Map<Integer,Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((key,value) -> {
            if(value > 1) {
                System.out.println(key);
            }
        });

        // Approach 2:
        Set<Integer> set = new HashSet<>();
        for (Integer i : arr) {
            if(set.contains(i)) {
                System.out.println(i);
            }
        }

        // Approach 3: using stream
    }
}
