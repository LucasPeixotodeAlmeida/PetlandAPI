package com.petland.model.animal.dto;

import java.time.LocalDate;

import com.petland.model.animal.enums.AnimalEspecie;


import lombok.Data;

@Data
public class AnimalRequestDTO {

    private Integer id;
    private String nome;
    private LocalDate nascimento;
    private AnimalEspecie especie;
}
