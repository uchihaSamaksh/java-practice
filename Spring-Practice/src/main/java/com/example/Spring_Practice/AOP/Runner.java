package com.example.Spring_Practice.AOP;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Runner {
    @GetMapping("/AOP")
    public String hello() {
        System.out.println("AOP is Working");
        return "Working";
    }

    @GetMapping("/args")
    public String hello(String name, Integer age) {
        System.out.println("AOP is Working");
        return "Working";
    }
}
