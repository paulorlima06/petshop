package com.paulo.petshop.domain;

import com.paulo.petshop.domain.enuns.SituacaoPagamento;

import jakarta.persistence.Entity;
@Entity
public class PagCartao extends Pagamento {
	
	private static final long serialVersionUID = 1L;
	
	private Integer parcelas;
	
	public PagCartao() {
		
	}

	public PagCartao(Integer id, Double valor, SituacaoPagamento situacao, Integer parcelas,Servico servico) {
		super(id, valor, situacao,servico);
		this.setParcelas(parcelas);;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}

	
	
	
	

}
