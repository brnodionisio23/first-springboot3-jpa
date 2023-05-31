package com.meuprojeto.projetosb.repositories;

import com.meuprojeto.projetosb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
