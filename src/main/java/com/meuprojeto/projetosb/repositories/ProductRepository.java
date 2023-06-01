package com.meuprojeto.projetosb.repositories;

import com.meuprojeto.projetosb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
