package com.paulo.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.petshop.domain.Cidade;


public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

	

}
