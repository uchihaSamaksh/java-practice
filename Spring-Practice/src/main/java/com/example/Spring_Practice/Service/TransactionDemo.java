package com.example.Spring_Practice.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Spring_Practice.Models.User;

@Service
public class TransactionDemo {
    // This class would typically contain methods to handle transactions,
    // such as updating user information in a database.
    // For example, you might have a method like this:
    
    @Transactional
    public void updateUser() {
        // Logic to update user in the database
        System.out.println("User updated successfully");
    }
    
    // Note: The actual implementation would depend on your specific requirements
    // and the database technology you are using.
}
