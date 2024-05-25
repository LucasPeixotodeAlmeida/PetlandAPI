package com.petland.model.atendimento.models.controller;

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

import com.petland.model.atendimento.models.dto.AtendimentoRequestDTO;
import com.petland.model.atendimento.models.dto.AtendimentoResponseDTO;
import com.petland.model.atendimento.models.service.AtendimentoService;

@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {
    @Autowired
    private AtendimentoService atendimentoService;

    @GetMapping("/")
    public List<AtendimentoResponseDTO> get(){
        
        return atendimentoService.listar();
    }

    @PostMapping("/cadastrar")
    public Integer gravar(@RequestBody AtendimentoRequestDTO request){
        return atendimentoService.gravar(request);
    }

    @PutMapping("/{id}")
    public Integer gravar(@PathVariable ("id") Integer id, 
                            @RequestBody AtendimentoRequestDTO request){
        return atendimentoService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void gravar(@PathVariable ("id") Integer id){
        atendimentoService.delete(id);
    }
}
