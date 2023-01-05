package com.paulo.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.petshop.domain.Pet;


public interface PetRepository extends JpaRepository<Pet, Integer> {

	

}
