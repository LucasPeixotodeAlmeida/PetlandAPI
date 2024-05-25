package com.petland.model.cadastro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cadastro")
@Data
public class CadastroEntity {
    @Id
    private Integer id;
    private String nome;
   //private Perfil perfil;
   //private Endereco endereco;
}
