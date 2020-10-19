package com.hs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hs, com.hs.controllers, com.hs.services")
public class HyderabadiStore {

	public static void main(String[] args) {
		SpringApplication.run(HyderabadiStore.class, args);
	}

	
	 
}
