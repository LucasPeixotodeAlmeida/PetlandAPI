package com.petland.model.atendimento.models.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.model.atendimento.models.dto.AtendimentoRequestDTO;
import com.petland.model.atendimento.models.dto.AtendimentoResponseDTO;
import com.petland.model.atendimento.models.entities.AtendimentoEntity;
import com.petland.model.atendimento.models.repository.AtendimentoRepository;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository atendimentoRepository;
    
    public Integer gravar(AtendimentoRequestDTO request){
        AtendimentoEntity entity = new AtendimentoEntity();
        BeanUtils.copyProperties(request, entity);
        return atendimentoRepository.save(entity).getId();
    }

    public Integer update(Integer id, AtendimentoRequestDTO request){
        AtendimentoEntity entity = atendimentoRepository.findById(id).orElse(null);
        if(entity != null){
            BeanUtils.copyProperties(request, entity);
            return atendimentoRepository.save(entity).getId();
        }

        return null;
    }

    public void delete(Integer id){
        atendimentoRepository.deleteById(id);
    }

    public List<AtendimentoResponseDTO> listar(){
        List<AtendimentoEntity> entities = atendimentoRepository.findAll();
        List<AtendimentoResponseDTO> response = new ArrayList<>();
        for(AtendimentoEntity e: entities){
            AtendimentoResponseDTO res = new AtendimentoResponseDTO();
            BeanUtils.copyProperties(e, res);
            response.add(res);
        }
        return response;
    }
}
