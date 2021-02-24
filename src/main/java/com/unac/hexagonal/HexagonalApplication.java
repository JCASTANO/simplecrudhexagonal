package com.unac.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Crud sencillo en arquitectura hexagonal o puertos y adaptadores
public class HexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalApplication.class, args);
	}

}
