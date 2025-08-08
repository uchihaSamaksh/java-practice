package com.example.Spring_Practice.Service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public String getOrderStatus(String orderId){
        return "Order is in progress";
    }
}
