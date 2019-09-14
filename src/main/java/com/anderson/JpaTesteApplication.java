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

        contar();


    }

    // Implementacoes


    // Contar total de registros
    private void contar(){
        long cont = categoriasRepository.count();
        System.out.println("TOTAL DE CATEGORIAS ENCONTRADAS "+ cont );
    }


    // Metodo excluir - CrudRepository
    private void excluir(){
        int idCategoria = 2;
        categoriasRepository.deleteById(idCategoria);

        System.out.println("O REGISTRO "+ idCategoria+" FOI EXCLUIDO!!!");

    }

    // Metodo atualizar - CrudRepository
    private void atualizar() {
        Optional<Categoria> optional = categoriasRepository.findById(3);
        if (optional.isPresent()) {
            Categoria categoria = optional.get();
            categoria.setNome("INFRAESTRUTURA");
            categoria.setDescricao("TRABALHOS DE HARDWARE E REDES");

            categoriasRepository.save(categoria);
            System.out.println(optional.get());
        } else
            System.out.println("CATEGORIA NÃO ENCONTRADA");

    }

    // Metodo buscar por id - CrudRepository
    private void buscarPorId() {
        Optional<Categoria> optional = categoriasRepository.findById(1);
        if (optional.isPresent())
            System.out.println(optional.get());
        else
            System.out.println("CATEGORIA NÃO ENCONTRADA");
    }


    // Metodo salvar - CrudRepository
    private void categoriaSalvar() {
        Categoria categoria = new Categoria();
        categoria.setNome("DESENVOLVIMENTO");
        categoria.setDescricao("DESENVOLVIMENTO DE SISTEMAS");

        categoriasRepository.save(categoria);
        System.out.println(categoria);
    }

}
