package com.projeto.projeto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "Aluno_tb",schema = "projeto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
    @Id
    @Column(name="id")
    @GeneratedValue(generator = "number")
    private Integer id;
    @Column(name="nome")
    private String nome;
    @Column(name="cpf")
    private String cpf;
    @Column(name="telefone")
    private String telefone;
}
