package com.example.livros.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.livros.services.DBservices;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBservices dBservices;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instanciaBasedeDados() {
		System.out.println("Entro");
		if(strategy.equals("create-drop")) {
			this.dBservices.instanciaBasedeDados();
			
		}
		return false;
	}
	
}
