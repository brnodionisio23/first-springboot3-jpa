package com.meuprojeto.projetosb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.projetosb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
