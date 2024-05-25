package com.petland.model.atendimento.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.atendimento.models.entities.AtendimentoEntity;

public interface AtendimentoRepository extends JpaRepository<AtendimentoEntity, Integer>{
    
}
