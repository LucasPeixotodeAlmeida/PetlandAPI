package com.petland.model.cadastros.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.cadastros.cadastro.entities.CadastroEntity;

public interface CadastroRepository extends JpaRepository<CadastroEntity, Integer>{

    
}
