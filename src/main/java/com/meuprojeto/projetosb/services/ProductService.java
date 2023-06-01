package com.meuprojeto.projetosb.services;

import com.meuprojeto.projetosb.entities.Product;
import com.meuprojeto.projetosb.entities.User;
import com.meuprojeto.projetosb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
