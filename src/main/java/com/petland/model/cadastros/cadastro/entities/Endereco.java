package com.petland.model.cadastros.cadastro.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Endereco {
    @Column(name = "logra", length = 50)
    private String logradouro;
    @Column(name = "nr", length = 6)
    private String numero;

}
