package com.example.livros.services;

import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.livros.domain.Categoria;
import com.example.livros.repositeries.CategoriaRepository;
import com.example.livros.services.exeception.ObjectNotFoundExcepion;

@Service
public class CategoriaServices {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria findById(Long id){
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcepion(
				"Id não Encontrado: "+ id + " Tipo: " + Categoria.class.getName()
				));
	}
}
