package com.projeto.projeto.mapper;

import com.projeto.projeto.dto.AlunoDto;
import com.projeto.projeto.entity.Aluno;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AlunoMapper {
    AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);
    @Mapping()
    AlunoDto toDto(Aluno aluno);
}
