package com.example.aula308ProjetoWebServicesSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula308ProjetoWebServicesSpringBoot.entities.Category;
import com.example.aula308ProjetoWebServicesSpringBoot.repositories.CategoryRepository;

//Component registration - para o CategoryService funcionar é preciso colocar uma anotação (@) antes da classe de Serviço.
//As anotaçõe são: @Component @Repository @Service

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
