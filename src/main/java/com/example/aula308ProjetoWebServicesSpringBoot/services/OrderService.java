package com.example.aula308ProjetoWebServicesSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula308ProjetoWebServicesSpringBoot.entities.Order;
import com.example.aula308ProjetoWebServicesSpringBoot.repositories.OrderRepository;

//Component registration - para o OrderService funcionar é preciso colocar uma anotação (@) antes da classe de Serviço.
//As anotaçõe são: @Component @Repository @Service

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
