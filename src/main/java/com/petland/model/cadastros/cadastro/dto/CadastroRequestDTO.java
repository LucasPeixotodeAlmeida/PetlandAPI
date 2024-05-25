package com.petland.model.cadastros.cadastro.dto;

import com.petland.model.cadastros.cadastro.entities.Endereco;
import com.petland.model.cadastros.cadastro.entities.Perfil;

import lombok.Data;


@Data
public class CadastroRequestDTO {


    private String nome;
    private Perfil perfil;
    private Endereco endereco;
}
