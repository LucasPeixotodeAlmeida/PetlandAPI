package com.petland.model.cadastros.animal.dto;

import java.time.LocalDate;

import com.petland.model.cadastros.animal.enums.AnimalEspecie;

import lombok.Data;

@Data
public class AnimalRequestDTO {

    private Integer id;
    private String nome;
    private LocalDate nascimento;
    private AnimalEspecie especie;
    private Integer tutor;
}
