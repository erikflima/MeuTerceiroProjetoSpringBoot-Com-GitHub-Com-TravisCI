package com.erikcompany.meuprojetospringbootcomgithubcomtravisCi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeuTerceiroProjetoSpringBootComGitHubComTravisCiApplication {

	public static void main(String[] args) {
		
		System.out.println("\n\nErik - Executando o metodo main e apos isso o metodo SpringApplication.run, que roda a aplicacao literalmente!\n\n");
		
		SpringApplication.run( MeuTerceiroProjetoSpringBootComGitHubComTravisCiApplication.class, args );
		
		System.out.println("\n\nErik - Finalizando a execucao do metodo main \n\n");		
		
	}
	
}
