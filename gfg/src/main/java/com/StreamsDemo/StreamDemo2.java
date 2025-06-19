package com.StreamsDemo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        // Creation
        // 1. Collection
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(x -> x%2 == 0).count();
        // 2. Array
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).filter(x -> x%2==1).count();
        // 3. Stream of
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        // 4. Stream Builder
        // 5. Stream Factory
        // 6. Stream Generator
        Stream<Integer> stream1 = Stream.generate(() -> (int)(Math.random()*100));  //infinite stream
        // 7. Stream Supplier
        Supplier<Integer> supplier = () -> (int)(Math.random()*100);
        // 8. Stream Consumer

        // Operations
        //Intermediate Operations
        List<String> list1 = Arrays.asList("apple","banana","cherry","date","elderberry","apricot");
        System.out.println("------------------Filter------------------");
        list1.stream().filter(x -> x.startsWith("a")).forEach(System.out::println);      //filter
        System.out.println("------------------Map------------------");
        list1.stream().map(x -> x.toUpperCase()).forEach(System.out::println);            //map
        System.out.println("------------------Sorted------------------");
        list1.stream().sorted().forEach(System.out::println);                            //sorted
        System.out.println("------------------Limit------------------");
        list1.stream().limit(3).forEach(System.out::println);                            //limit
        System.out.println("------------------Skip------------------");
        list1.stream().skip(3).forEach(System.out::println);                            //skip
        System.out.println("------------------Distinct------------------");
        list1.stream().distinct().forEach(System.out::println);                         //distinct
        System.out.println("------------------Peek------------------");
        list1.stream().peek(System.out::println).count();                              //peek
        System.out.println("------------------Collect------------------");
        // list1.stream().collect(Collectors.toList());                                   //collect

        //Terminal Operations
        System.out.println("------------------ForEach------------------");
        list1.stream().forEach(System.out::println);
        System.out.println("------------------ForEachOrdered------------------");
        list1.stream().forEachOrdered(System.out::println);
        System.out.println("------------------Reduce------------------");
        list1.stream().reduce((x,y) -> x+y).ifPresent(System.out::println);
        System.out.println("------------------Collect------------------");
        List<String> list2 = list1.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
        System.out.println(list2);
        System.out.println("------------------Count------------------");
        long count = list1.stream().filter(x -> x.startsWith("a")).count();
        System.out.println(count);
        System.out.println("------------------Min------------------");
        Optional<String> min = list1.stream().min((x,y) -> x.length() - y.length());    
        System.out.println(min.get());
        System.out.println("------------------Max------------------");
        Optional<String> max = list1.stream().max((x,y) -> x.length() - y.length());
        System.out.println(max.get());
        System.out.println("------------------AnyMatch------------------");
        boolean anyMatch = list1.stream().anyMatch(x -> x.startsWith("a"));
        System.out.println(anyMatch);
        System.out.println("------------------AllMatch------------------");

        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // example - squareing and sorting numbers
        System.out.println(numbers.stream().map(x-> x*x).sorted().toList());
        // summing
        System.out.println(numbers.stream().reduce((x,y) -> x+y));

        String str = "Hello World";
        // example - counting the number of characters in the string
        System.out.println(str.toCharArray().length);
        //counting the occurence of a character in the string
        System.out.println(str.toLowerCase().chars().filter(x -> x == 'l').count());    //-> Cant use toCharArray() here because because Arrays.list does not support primitive types

        //summarizingInt
        IntSummaryStatistics intSummaryStatistics = list.stream().map(x->x%2).collect(Collectors.summarizingInt(x->x));
        System.out.println(intSummaryStatistics.getSum());
    }
}   