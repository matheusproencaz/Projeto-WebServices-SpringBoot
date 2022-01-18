package com.example.aula308ProjetoWebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aula308ProjetoWebServicesSpringBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}