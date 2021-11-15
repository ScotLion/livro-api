package com.example.livros.DTO;

import java.io.Serializable;

import com.example.livros.domain.Categoria;

public class CategoriaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String Descricao;

	public CategoriaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoriaDTO(Categoria objCategoria) {
		super();
		this.id = objCategoria.getId();
		this.nome = objCategoria.getNome();
		Descricao = objCategoria.getDescricao();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
