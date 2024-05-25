package com.petland.model.atendimento.models.dto;

import java.time.LocalDateTime;

import com.petland.model.atendimento.models.enums.AtendimentoStatus;
import com.petland.model.atendimento.models.enums.AtendimentoTipo;

import lombok.Data;


@Data
public class AtendimentoRequestDTO {
    private Integer id;
    private String descricao;
    private LocalDateTime data;
    private Double valor;
    private Boolean emergencia;
    private AtendimentoTipo tipo;
    private AtendimentoStatus status;
    private Integer animal;
    private Integer produtoServico;
    private Integer cadastro;
}
