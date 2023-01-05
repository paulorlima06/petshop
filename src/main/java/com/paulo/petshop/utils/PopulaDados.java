package com.paulo.petshop.utils;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paulo.petshop.domain.Categoria;
import com.paulo.petshop.repository.CategoriaRepository;

import jakarta.annotation.PostConstruct;

@Component
public class PopulaDados {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@PostConstruct
	public void cadastrar() {
		Categoria cat1 = new Categoria(null,"Alimento");
		Categoria cat2 = new Categoria(null,"Cosmético");
		Categoria cat3 = new Categoria(null,"Remédio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
	}
	
}
