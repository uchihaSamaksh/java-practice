package com.example.Spring_Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = "com.example.Spring_Practice")
@EnableAsync
// @ComponentScan(basePackages = "com.example.Spring_Practice")
// @ComponentScan(basePackages = "com.example.Spring_Practice.Controllers")
public class SpringPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPracticeApplication.class, args);
	}

}
