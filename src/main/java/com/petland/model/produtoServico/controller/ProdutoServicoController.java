package com.petland.model.produtoServico.controller;

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

import com.petland.model.produtoServico.entities.ProdutoServicoEntity;
import com.petland.model.produtoServico.repository.ProdutoServicoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoServicoController {
    @Autowired
    private ProdutoServicoRepository produtoServicoRepository;

    @GetMapping("/")
    public List<ProdutoServicoEntity> listar(){
        return produtoServicoRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Integer gravar(@RequestBody ProdutoServicoEntity request){
        produtoServicoRepository.save(request);
        return request.getId();
    }

    @PutMapping("/{id}")
    public Integer gravar(@PathVariable ("id") Integer id, 
                            @RequestBody ProdutoServicoEntity request){
        request.setId(id);
        produtoServicoRepository.save(request);
        return request.getId();
    }

    @DeleteMapping("/{id}")
    public void gravar(@PathVariable ("id") Integer id){
        produtoServicoRepository.deleteById(id);
    }
}
