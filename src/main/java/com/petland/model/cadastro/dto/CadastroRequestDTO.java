package com.petland.model.cadastro.dto;

import com.petland.model.cadastro.entities.Endereco;
import com.petland.model.cadastro.entities.Perfil;
import lombok.Data;


@Data
public class CadastroRequestDTO {


    private String nome;
    private Perfil perfil;
    private Endereco endereco;
}
