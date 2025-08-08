package main.java.com.StreamsDemo;

import java.util.function.Predicate;

public class DemoFunctionalInterfaceUSe {
    public static void main(String[] args) {
        DemoFunctionaInterface<Integer> sum = (a,b) -> a+b;
        System.out.println(sum.calculate(10,20));

        // Predicate
    }    
}
