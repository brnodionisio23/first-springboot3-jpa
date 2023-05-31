package com.meuprojeto.projetosb.repositories;

import com.meuprojeto.projetosb.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
