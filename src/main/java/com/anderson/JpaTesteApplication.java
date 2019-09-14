package com.anderson;

import com.anderson.model.Categoria;
import com.anderson.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

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

        buscarPorId();


    }

    // Implementacoes

    private void buscarPorId() {
        Optional<Categoria> optional = categoriasRepository.findById(1);
        if (optional.isPresent())
            System.out.println(optional.get());
        else
            System.out.println("CATEGORIA NÃO ENCONTRADA");
    }


    private void categoriaSalvar() {
        Categoria categoria = new Categoria();
        categoria.setNome("FINANCEIRO");
        categoria.setDescricao("Trabalhos de contabilidade");

        categoriasRepository.save(categoria);
        System.out.println(categoria);
    }

}
