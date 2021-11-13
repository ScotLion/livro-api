package com.example.livros.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.livros.domain.Categoria;
import com.example.livros.domain.Livro;
import com.example.livros.repositeries.CategoriaRepository;
import com.example.livros.repositeries.LivroRepository;

@Service
public class DBservices {
	//criando objeto das inteface CategoriaRepository para passar por paramento o objeto da classe Categoria cat1
		@Autowired
		private CategoriaRepository categoriaRepository;
		@Autowired
		private LivroRepository livroRepository;
	
	public void instanciaBasedeDados() {
		// TODO Auto-generated method stub
				Categoria cat1 = new Categoria(null, "Terro", "Livro de terror");
				Categoria cat2 = new Categoria(null, "Suspense", "Livro de Suspense");
				Categoria cat3 = new Categoria(null, "Informatica", "Livro de Programção");
				// a categoria foi informada ao livro
				Livro livro1 = new Livro(null, "O Assassinato", "João Silva", "Livro sobre assassinos", cat1);
				Livro livro2 = new Livro(null, "O Terrorista", "João terrista", "Livro sobre Guerras Terroristas", cat2);
				Livro livro3 = new Livro(null, "O Software", "Steven Jobs", "Livro Sobre desenvolvimento Web", cat3);
				// o livro foi informado a categoria
				cat1.getListaLivro().addAll(Arrays.asList(livro1));
				cat2.getListaLivro().addAll(Arrays.asList(livro2));
				cat3.getListaLivro().addAll(Arrays.asList(livro3));

				this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
				this.livroRepository.saveAll(Arrays.asList(livro1, livro2, livro3));
	}

}
