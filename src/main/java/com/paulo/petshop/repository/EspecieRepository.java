package com.paulo.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.petshop.domain.Especie;


public interface EspecieRepository extends JpaRepository<Especie, Integer> {

	

}
