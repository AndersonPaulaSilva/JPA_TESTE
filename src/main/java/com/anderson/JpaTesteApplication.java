package com.anderson;

import com.anderson.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaTesteApplication implements CommandLineRunner {

	@Autowired
	private CategoriasRepository categoriasRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaTesteApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		// Metodos a serem executados:

		System.out.println(categoriasRepository);


	}

	// Implementacoes


}
