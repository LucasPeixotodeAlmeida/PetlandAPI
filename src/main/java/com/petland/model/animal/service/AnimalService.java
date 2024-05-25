package com.petland.model.animal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.model.animal.dto.AnimalResponseDTO;
import com.petland.model.animal.entities.AnimalEntity;
import com.petland.model.animal.repository.AnimalRepository;

@Service
public class AnimalService {
    
    @Autowired
    private AnimalRepository animalRepository;

    public List<AnimalResponseDTO> listar(){
        List<AnimalEntity> entities = animalRepository.findAll();
        List<AnimalResponseDTO> response = new ArrayList<>();
        for(AnimalEntity e: entities){
            AnimalResponseDTO res = new AnimalResponseDTO();
            BeanUtils.copyProperties(e, res);
            response.add(res);
        }
        return response;
    }
}
