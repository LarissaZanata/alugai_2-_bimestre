package com.uem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uem.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {
	
	Filme findByTitulo(String titulo);
	
    
}
