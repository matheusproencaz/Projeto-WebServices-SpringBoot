package com.example.aula308ProjetoWebServicesSpringBoot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.aula308ProjetoWebServicesSpringBoot.entities.User;
import com.example.aula308ProjetoWebServicesSpringBoot.repositories.UserRepository;

@Configuration
@Profile("test") //Precisa ser o mesmo nome que foi colocado no arquio application.properties no spring.profiles.active=test
public class TestConfig implements CommandLineRunner/* Implementar essa interface permite executar essa classe quando o programa for executado*/{

	//Injeção de dependência desacoplada com framework.
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com","988888888","123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com","977777777","123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
	
}