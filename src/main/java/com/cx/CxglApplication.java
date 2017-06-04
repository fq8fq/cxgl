package com.cx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@RestController*/
@EnableAutoConfiguration
public class CxglApplication {

	public static void main(String[] args) {
		SpringApplication.run(CxglApplication.class, args);
	}
	
}
