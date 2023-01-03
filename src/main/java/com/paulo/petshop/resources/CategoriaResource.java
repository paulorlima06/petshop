package com.paulo.petshop.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulo.petshop.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")

public class CategoriaResource {

	@GetMapping()
	public List<Categoria> show() {
		
		Categoria cat1 = new Categoria(1, "Alimento");
		Categoria cat2 = new Categoria(2, "Cosmético");
		Categoria cat3 = new Categoria(3, "Remédio");
		
		List<Categoria> lista = new ArrayList<>();
		
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		
		return lista;
	}
	
}
