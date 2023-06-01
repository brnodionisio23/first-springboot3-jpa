package com.meuprojeto.projetosb.repositories;

import com.meuprojeto.projetosb.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
