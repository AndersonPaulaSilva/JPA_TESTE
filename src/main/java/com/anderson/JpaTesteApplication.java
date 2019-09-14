package com.anderson;

import com.anderson.model.Categoria;
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

		categoriaSalvar();



	}

	// Implementacoes

	private void categoriaSalvar(){
		Categoria categoria = new Categoria();
		categoria.setNome("FINANCEIRO");
		categoria.setDescricao("Trabalhos de contabilidade");

		categoriasRepository.save(categoria);
		System.out.println(categoria);
	}

}
