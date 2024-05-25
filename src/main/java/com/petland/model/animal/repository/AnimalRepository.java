package com.petland.model.animal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.animal.entities.AnimalEntity;

public interface AnimalRepository extends JpaRepository<AnimalEntity, Integer>{
    
}
