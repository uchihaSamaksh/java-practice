package com.example.Spring_Practice.Service;

import org.springframework.stereotype.Service;

@Service    
public class CalculatorServiceImpl {
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }
}
