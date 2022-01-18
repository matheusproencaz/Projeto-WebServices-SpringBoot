package com.example.aula308ProjetoWebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aula308ProjetoWebServicesSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}