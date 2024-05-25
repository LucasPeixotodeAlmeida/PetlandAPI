package com.petland.model.produtoServico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.produtoServico.entities.ProdutoServicoEntity;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServicoEntity, Integer>{
    
}
