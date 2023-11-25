package com.projeto.projeto.resource;

import com.projeto.projeto.dto.AlunoDto;
import com.projeto.projeto.service.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/aluno")
public class AlunoResource {
    private final AlunoService service;

    public AlunoResource(AlunoService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<AlunoDto> findAll(){
        return this.service.findAll();
    }
}
