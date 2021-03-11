package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootGit12Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootGit12Application.class, args);
		
		System.out.println("Application Started run");
	}

}
