package com.example.livros.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.livros.domain.Livro;

//@Repository informa que estamos criando um interface de comiunicação para persistencia no banco de dados
@Repository
// JpaRepository<p1, p2> p1 é classe a que a inteface vai se referir p2 é tipo da chave primaria da classe
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
