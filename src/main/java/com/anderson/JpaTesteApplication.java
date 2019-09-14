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

		deletar();
	}

	// Implementacoes

	private void salvar() {

		System.out.println("TESTE DO METODO SALVAR....");
	}

	private void deletar(){
		System.out.println("TESTE DO METODO DELETAR");
	}
}
