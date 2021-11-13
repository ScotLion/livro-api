//alt + shift + s menu
//ctrl + d deleta uma linha
//ctrl + shift + F organiza o codigo
package com.example.livros.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// @Entity vai cria uma tabela na base de dados
//@Entity name = "tbl_categoria"; é possivel informa o nome da tabela se nao informa Entity cria a tabela com o nome da classe

@Entity
public class Categoria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Essa notação informa que id é uma chave primaria
	//GeneratedValue(strategy = GenerationType.IDENTITY)
	// IDENTITY é usado pelo MySQL (AUTO_INCREMENT), Oracle 12c, DB2...
	// SEQUENCE é usado pelo PostGres, DB2 ...
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String nome;
	private String Descricao;

	//@OneToMany é usado para indicar relação de 1 para N uma categoria possui varius livros
	//mappedBy é usado para mapear
	@OneToMany(mappedBy = "categoria")
	private List<Livro> listaLivro = new ArrayList<>();

	public Categoria() {
		super();
	}

	public Categoria(Integer id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		Descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public List<Livro> getListaLivro() {
		return listaLivro;
	}

	public void setListaLivro(List<Livro> listaLivro) {
		this.listaLivro = listaLivro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}

}
