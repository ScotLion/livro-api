package com.example.livros.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.livros.services.DBservices;

@Configuration
@Profile("test")
public class TesteConfig {
	
	@Autowired
	private DBservices dBservices;
	
	//@Bean informa que toda vez que a aplicação for iniciada e que o perfil for test o metodo intanciaBasedeDados() vai ser execultado
	@Bean
	public void intanciaBasedeDados() {
		this.dBservices.instanciaBasedeDados();
	}

}
