package com.example.livros;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.livros.domain.Categoria;
import com.example.livros.domain.Livro;
import com.example.livros.repositeries.CategoriaRepository;
import com.example.livros.repositeries.LivroRepository;

@SpringBootApplication
public class LivrosApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(LivrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria cat1 = new Categoria(null, "Terro", "Livro de terror");
		// a categoria foi informada ao livro
		Livro livro1 = new Livro(null, "O Perigo", "João Pirigoso", "Livro aterrozando do Joao", cat1);
		// o livro foi informado a categoria
		cat1.getListaLivro().addAll(Arrays.asList(livro1));

		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(livro1));
	}

}
