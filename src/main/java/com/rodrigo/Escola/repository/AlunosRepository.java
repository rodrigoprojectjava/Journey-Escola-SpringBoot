package com.rodrigo.Escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.Escola.model.AlunosModel;

public interface AlunosRepository extends JpaRepository<AlunosModel, Long>{

}
