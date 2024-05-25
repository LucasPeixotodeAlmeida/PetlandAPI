package com.petland.model.cadastros.cadastro.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Perfil {
    private boolean cliente;
    private boolean fornecedor;
    private boolean prestador;

}
