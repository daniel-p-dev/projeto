package com.projeto.projeto.repository;

import com.projeto.projeto.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Integer> {
}
