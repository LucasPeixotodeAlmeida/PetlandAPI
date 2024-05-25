package com.petland.model.animal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.model.animal.entities.AnimalEntity;
import com.petland.model.animal.repository.AnimalRepository;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/")
    public List<AnimalEntity> listar(){
        return animalRepository.findAll();
    }
}
