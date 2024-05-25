package com.petland.model.cadastro.controller;

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

import com.petland.model.cadastro.dto.CadastroRequestDTO;
import com.petland.model.cadastro.dto.CadastroResponseDTO;
import com.petland.model.cadastro.service.CadastroService;

@RestController
@RequestMapping("/cadastros")
public class ClienteController {

    @Autowired
    private CadastroService cadastroService;
    
    @GetMapping("/")
    public List<CadastroResponseDTO> get(){
        
        return cadastroService.listar();
    }

    @PostMapping("/cadastrar")
    public Integer gravar(@RequestBody CadastroRequestDTO request){
        return cadastroService.gravar(request);
    }

    @PutMapping("/{id}")
    public Integer gravar(@PathVariable ("id") Integer id, 
                            @RequestBody CadastroRequestDTO request){
        return cadastroService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void gravar(@PathVariable ("id") Integer id){
        cadastroService.delete(id);
    }
}
