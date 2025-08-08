package main.java.com.StreamsDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToMap {
    public static void main(String[] args) {
        String str = "hello world hello stream hello";

        String[] strArray = str.split(" ");
        Map<String,Long> strOccurance = Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(strOccurance);
        
    }
}
