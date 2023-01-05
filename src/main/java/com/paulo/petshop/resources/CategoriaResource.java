package com.paulo.petshop.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulo.petshop.domain.Categoria;
import com.paulo.petshop.service.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")

public class CategoriaResource {
	
	
	@Autowired
	CategoriaService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> show(@PathVariable Integer id) {
		
	Categoria obj = service.find(id);  
		
		return ResponseEntity.ok().body(obj);
	}
	
}
