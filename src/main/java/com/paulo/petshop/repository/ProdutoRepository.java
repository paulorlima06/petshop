package com.paulo.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.paulo.petshop.domain.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


}
