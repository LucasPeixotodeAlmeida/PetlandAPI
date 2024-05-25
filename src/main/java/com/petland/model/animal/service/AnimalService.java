package com.petland.model.animal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.model.animal.dto.AnimalRequestDTO;
import com.petland.model.animal.dto.AnimalResponseDTO;
import com.petland.model.animal.entities.AnimalEntity;
import com.petland.model.animal.repository.AnimalRepository;

@Service
public class AnimalService {
    
    @Autowired
    private AnimalRepository animalRepository;

    public Integer gravar(AnimalRequestDTO request){
        AnimalEntity entity = new AnimalEntity();
        BeanUtils.copyProperties(request, entity);
        return animalRepository.save(entity).getId();
    }

    public Integer update(Integer id, AnimalRequestDTO request){
        AnimalEntity entity = animalRepository.findById(id).orElse(null);
        if(entity != null){
            BeanUtils.copyProperties(request, entity);
            return animalRepository.save(entity).getId();
        }

        return null;
    }

    public void delete(Integer id){
        animalRepository.deleteById(id);
    }

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
