package com.paulo.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.paulo.petshop.domain.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	

}
