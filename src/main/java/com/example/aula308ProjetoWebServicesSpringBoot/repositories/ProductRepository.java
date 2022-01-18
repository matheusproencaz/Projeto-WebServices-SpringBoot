package com.example.aula308ProjetoWebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aula308ProjetoWebServicesSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}