package com.petland.model.cadastros.animal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.cadastros.animal.entities.AnimalEntity;

public interface AnimalRepository extends JpaRepository<AnimalEntity, Integer>{
    
}
