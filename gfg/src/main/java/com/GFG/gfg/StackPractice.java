package com.GFG.gfg;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        System.out.println("Peeking at the top of the stack");
        System.out.println(stack.peek());

        System.out.println("Popping the top of the stack");
        System.out.println(stack.pop());
        System.out.println(stack);
        
        stack.add(1 ,5);
        System.out.println(stack);

        stack.set(2,6);
        System.out.println(stack);
        
        System.out.println("Printing value at 1");
        System.out.println(stack.get(1));

        System.out.println("Checking if stack is empty");
        System.out.println(stack.isEmpty());
        
        
    }
}
