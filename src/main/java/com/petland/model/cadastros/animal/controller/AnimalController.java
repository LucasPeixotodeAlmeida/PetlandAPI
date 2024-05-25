package com.petland.model.cadastros.animal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.model.cadastros.animal.dto.AnimalRequestDTO;
import com.petland.model.cadastros.animal.dto.AnimalResponseDTO;
import com.petland.model.cadastros.animal.service.AnimalService;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/")
    public List<AnimalResponseDTO> get(){
        
        return animalService.listar();
    }

    @PostMapping("/cadastrar")
    public Integer gravar(@RequestBody AnimalRequestDTO request){
        return animalService.gravar(request);
    }

    @PutMapping("/{id}")
    public Integer gravar(@PathVariable ("id") Integer id, 
                            @RequestBody AnimalRequestDTO request){
        return animalService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void gravar(@PathVariable ("id") Integer id){
        animalService.delete(id);
    }
}
