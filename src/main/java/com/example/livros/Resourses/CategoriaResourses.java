package com.example.livros.Resourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.livros.domain.Categoria;
import com.example.livros.services.CategoriaServices;

//informa que é uma classe controladora
@RestController
@RequestMapping(value = "/Categorias")
public class CategoriaResourses {
	@Autowired
	private CategoriaServices  categoriaServices;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Categoria obj = categoriaServices.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}

// 1 é o iD da categoria
//localhost:8080/Categorias/1
