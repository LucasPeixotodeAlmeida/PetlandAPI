package com.petland.model.animal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.model.animal.dto.AnimalResponseDTO;
import com.petland.model.animal.service.AnimalService;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/")
    public List<AnimalResponseDTO> get(){
        
        return animalService.listar();
    }
}
