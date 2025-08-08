package com.example.Spring_Practice.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.Spring_Practice.Service.CalculatorServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import com.example.Spring_Practice.Service.AsyncDemoService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorServiceImpl calculatorService;

    @Autowired
    private AsyncDemoService asyncDemoService;


    @RequestMapping(path = "/add", method = RequestMethod.GET)
    public String add(@RequestParam int a, @RequestParam int b){
        return "The sum of " + a + " and " + b + " is " + calculatorService.add(a, b);
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int a, @RequestParam int b){
        return "The difference of " + a + " and " + b + " is " + calculatorService.subtract(a, b);
    }

    // @PostMapping("/multiply")
    // public String multiply(@RequestBody CalculatorRequest request){
    //     return "The product of " + a + " and " + b + " is " + calculatorService.multiply(a, b);
    // }

    // @GetMapping("/divide/{a}/{b}")
    // public String divide(@PathVariable int a, @PathVariable int b){
    //     return "The quotient of " + a + " and " + b + " is " + calculatorService.divide(a, b);
    // }

    // @GetMapping("/square/{a}")
    // public ResponseEntity<String> square(@PathVariable int a){
    //     return ResponseEntity.ok("The square of " + a + " is " + calculatorService.square(a));
    // }

    @GetMapping("/async")
    public String async(){
        System.out.println("Async Controller: " + Thread.currentThread().getName());
        asyncDemoService.asyncDemo();
        return "Async";
    }
}

