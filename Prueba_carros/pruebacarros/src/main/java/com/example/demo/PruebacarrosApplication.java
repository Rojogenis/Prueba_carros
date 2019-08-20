package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebacarrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebacarrosApplication.class, args);
				System.out.println("Hola mundo desde git");

		Camioneta coche1 = new Camioneta(6, 1500, 3500, 10, 15000);
		System.out.println(coche1.toString());
		
		
	}

}
