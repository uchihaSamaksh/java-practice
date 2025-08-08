package com.example.Spring_Practice.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Practice.Models.User;
import com.example.Spring_Practice.Service.TransactionDemo;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionDemo transactionDemo;

    @GetMapping("/update")
    public String updateUser(){
        transactionDemo.updateUser();
        return "User updated successfully";
    }
}
