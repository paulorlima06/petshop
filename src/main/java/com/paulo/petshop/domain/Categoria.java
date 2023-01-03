package com.paulo.petshop.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	private String name;
	
	public Categoria() {
		
	}

	public Categoria(Integer id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(Id, other.Id);
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
