package com.example.aula308ProjetoWebServicesSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aula308ProjetoWebServicesSpringBoot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}