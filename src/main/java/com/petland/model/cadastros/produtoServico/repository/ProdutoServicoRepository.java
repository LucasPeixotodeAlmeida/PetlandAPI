package com.petland.model.cadastros.produtoServico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.cadastros.produtoServico.entities.ProdutoServicoEntity;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServicoEntity, Integer>{
    
}
