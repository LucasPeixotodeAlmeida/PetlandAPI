package com.petland.model.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.cadastro.entities.CadastroEntity;

public interface CadastroRepository extends JpaRepository<CadastroEntity, Integer>{

    
}
