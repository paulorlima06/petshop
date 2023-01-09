package com.paulo.petshop.domain;

import java.io.Serializable;
import java.util.Objects;

import com.paulo.petshop.domain.enuns.SituacaoPagamento;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pagamento implements Serializable {
	 
		private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	private Double valor;
	private SituacaoPagamento situacao;
	
	@OneToOne
	@JoinColumn(name = "id_servico")
	@MapsId
	private Servico servico;
	
	
	public Pagamento() {
		
	}

	public Pagamento(Integer id, Double valor, SituacaoPagamento situacao, Servico servico) {
		super();
		this.id = id;
		this.valor = valor;
		this.situacao = situacao;
		this.servico = servico;
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
		Pagamento other = (Pagamento) obj;
		return Objects.equals(id, other.id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public SituacaoPagamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoPagamento situacao) {
		this.situacao = situacao;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}
	
	

}
