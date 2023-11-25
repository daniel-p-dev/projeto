package com.projeto.projeto.service;

import com.projeto.projeto.dto.AlunoDto;
import com.projeto.projeto.entity.Aluno;
import com.projeto.projeto.mapper.AlunoMapper;
import com.projeto.projeto.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository repository;
    private final AlunoMapper mapper;

    public AlunoService(AlunoRepository repository, AlunoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
    public List<AlunoDto> findAll(){
        List<Aluno> aluno = this.repository.findAll();
        List<AlunoDto> dto = this.mapper.toDto(aluno);
        return dto;

    }
}

