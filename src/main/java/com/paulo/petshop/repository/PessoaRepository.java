package com.paulo.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.petshop.domain.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

	

}
