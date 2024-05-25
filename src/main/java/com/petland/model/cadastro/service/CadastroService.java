package com.petland.model.cadastro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.model.cadastro.dto.CadastroRequestDTO;
import com.petland.model.cadastro.dto.CadastroResponseDTO;
import com.petland.model.cadastro.entities.CadastroEntity;
import com.petland.model.cadastro.repository.CadastroRepository;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepository cadastroRepository;

    public Integer gravar(CadastroRequestDTO request){
        CadastroEntity entity = new CadastroEntity();
        BeanUtils.copyProperties(request, entity);
        return cadastroRepository.save(entity).getId();
    }

    public Integer update(Integer id, CadastroRequestDTO request){
        CadastroEntity entity = cadastroRepository.findById(id).orElse(null);
        if(entity != null){
            BeanUtils.copyProperties(request, entity);
            return cadastroRepository.save(entity).getId();
        }

        return null;
    }

    public void delete(Integer id){
        cadastroRepository.deleteById(id);
    }

    public List<CadastroResponseDTO> listar(){
        List<CadastroEntity> entities = cadastroRepository.findAll();
        List<CadastroResponseDTO> response = new ArrayList<>();
        for(CadastroEntity e: entities){
            CadastroResponseDTO res = new CadastroResponseDTO();
            BeanUtils.copyProperties(e, res);
            response.add(res);
        }
        return response;
    }
}
