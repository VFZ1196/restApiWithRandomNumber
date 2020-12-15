package com.springboot;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RequestParamApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestParamApplication.class, args);
		
		Random random = new Random();
		int x = random.nextInt(50);
		System.out.println("Random number from main method: "+x);
	}

}
