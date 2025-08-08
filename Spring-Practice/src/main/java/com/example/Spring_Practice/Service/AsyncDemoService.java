package com.example.Spring_Practice.Service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncDemoService {

    @Async
    public String asyncDemo(){
        System.out.println("Async Demo Service: " + Thread.currentThread().getName());
        return "Async Demo";
    }
}
