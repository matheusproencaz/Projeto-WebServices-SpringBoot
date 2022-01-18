package com.example.aula308ProjetoWebServicesSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula308ProjetoWebServicesSpringBoot.entities.Product;
import com.example.aula308ProjetoWebServicesSpringBoot.repositories.ProductRepository;

//Component registration - para o ProductService funcionar é preciso colocar uma anotação (@) antes da classe de Serviço.
//As anotaçõe são: @Component @Repository @Service

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
