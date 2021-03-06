package com.example.aula308ProjetoWebServicesSpringBoot.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.aula308ProjetoWebServicesSpringBoot.entities.User;
import com.example.aula308ProjetoWebServicesSpringBoot.repositories.UserRepository;
import com.example.aula308ProjetoWebServicesSpringBoot.services.exceptions.DatabaseException;
import com.example.aula308ProjetoWebServicesSpringBoot.services.exceptions.ResourceNotFoundException;

//Component registration - para o UserService funcionar é preciso colocar uma anotação (@) antes da classe de Serviço.
//As anotaçõe são: @Component @Repository @Service

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
		repository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	//getOne prepara o objeto ao invés de ir até o banco de dados e pegar o id, fazendo assim ser mais eficiente o método.
	public User update(Long id, User obj) {
		try {
			@SuppressWarnings("deprecation")
			User entity = repository.getOne(id); 
			updateData(entity,obj);
			return repository.save(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
		
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	
}
