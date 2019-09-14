package com.anderson;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaTesteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaTesteApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		// Metodos a serem executados:

		System.out.println("PRIMEIRO TESTE EXECUTADO...");
	}
}
