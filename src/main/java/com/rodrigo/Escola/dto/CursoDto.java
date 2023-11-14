package com.rodrigo.Escola.dto;

import java.time.LocalDate;

import com.rodrigo.Escola.model.CursosModel;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDto {

	private Long id;
	private String curso;
	private LocalDate dataInicio;
	private LocalDate dataConclusao;
	private Long nota;
	
	
	public CursoDto(CursosModel cursosModel) {
		this.id = cursosModel.getId();
		this.curso = cursosModel.getCurso();
		this.dataInicio = cursosModel.getDataInicio();
		this.dataConclusao = cursosModel.getDataConclusao();
		this.nota = cursosModel.getNota();
	}
	
	
	
}

