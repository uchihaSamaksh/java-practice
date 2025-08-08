package com.example.Spring_Practice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // @Autowired
    private OrderService orderService;

    // @Autowired
    // public void setOrderService(OrderService orderService){
    //     this.orderService = orderService;
    // }

    @Autowired
    public UserService(OrderService orderService){
        this.orderService = orderService;
    }

    public String getUserDetails(String userId){
        return "User details" + orderService.getOrderStatus("123");
    }
}