package com.projeto.projeto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDto {
    private Integer id;
    private String nome;
    private String cpf;

    private String telefone;
}
