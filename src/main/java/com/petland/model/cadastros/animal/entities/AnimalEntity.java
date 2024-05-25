package com.petland.model.cadastros.animal.entities;

import java.time.LocalDate;

import com.petland.model.cadastros.animal.enums.AnimalEspecie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
@Table(name = "animal")
public class AnimalEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nome;

    private LocalDate nascimento;

    @Enumerated(EnumType.STRING)
    private AnimalEspecie especie;

    @Column(name = "cad_tutor")
    private Integer tutor;
}
