package com.bridglab.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("hello from sneha");
		SpringApplication.run(DemoApplication.class, args);
	}

}
