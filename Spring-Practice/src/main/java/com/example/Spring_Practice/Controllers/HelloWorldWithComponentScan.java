package com.example.Spring_Practice.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldWithComponentScan {

    @GetMapping("/hello-component-scan")
    public String sayHello(){
        return "Hello World With Component Scan";
    }
}
