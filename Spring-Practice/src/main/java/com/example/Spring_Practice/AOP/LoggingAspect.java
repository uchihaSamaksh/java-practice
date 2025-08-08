package com.example.Spring_Practice.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(* com.example.Spring_Practice.AOP.Runner.hello())")
    public void before() {
        System.out.println("Before");
    }

    @After("execution(* com.example.Spring_Practice.AOP.Runner.hello())")
    public void after() {
        System.out.println("After");
    }

    // @Before("args(String, Integer)")
    // public void beforeArgs(String name, Integer age) {
    //     System.out.println("Before Args: " + name + " " + age);
    // }

    @Pointcut("execution(* com.example.Spring_Practice.AOP.Runner.hello())")
    public void customPointcut() {
        // Can be used to create a named pointcut expression for reuse
    }

    @Before("customPointcut()")
    public void beforeCustomPointcut() {
        System.out.println("Before Custom Pointcut");
    }

    @Around("customPointcut()")
    public void aroundCustomPointcut(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around- Before Custom Pointcut");
        joinPoint.proceed();
        System.out.println("Around- After Custom Pointcut");
    }
}
