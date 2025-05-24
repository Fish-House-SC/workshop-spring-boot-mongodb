package com.fish_house.workshopmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkshopmongoApplication {

	public static void main(String[] args) {
		System.out.println("==> Inicializando aplicação com MongoDB");
		SpringApplication.run(WorkshopmongoApplication.class, args);
	}

}
