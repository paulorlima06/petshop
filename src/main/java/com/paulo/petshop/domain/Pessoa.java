package com.paulo.petshop.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {
	 
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String codNacional;
	
	@OneToMany(mappedBy = "pessoa")
	private List<Endereco> endereco = new ArrayList<>();
	
	@ElementCollection
	@CollectionTable(name = "TELEFONE",joinColumns = @JoinColumn(name = "id_pessoa"))
	private Set<String> telefones = new HashSet<>(); 
	
	public Pessoa() {
		
	}

	

	public Pessoa(Integer id, String nome, String email, String codNacional) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.codNacional = codNacional;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCodNacional() {
		return codNacional;
	}



	public void setCodNacional(String codNacional) {
		this.codNacional = codNacional;
	}



	public List<Endereco> getEndereco() {
		return endereco;
	}



	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}



	public Set<String> getTelefones() {
		return telefones;
	}



	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}
	
	
	

}
