package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActivitiesApplication {

        public String PORT = System.getenv("PORT");
    
	public static void main(String[] args) {
		SpringApplication.run(ActivitiesApplication.class, args);
	}

}
