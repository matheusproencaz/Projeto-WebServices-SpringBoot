package com.example.aula308ProjetoWebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aula308ProjetoWebServicesSpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}