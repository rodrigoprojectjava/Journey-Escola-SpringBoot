package com.rodrigo.Escola.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import com.rodrigo.Escola.model.AlunosModel;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AlunoDto {

	private Long id;
	private String usuario;	
	private String cpf;
    private String email;
	private String nome;
	private String sobreNome;
	private Integer idade;
	private String curso;
	
	public AlunoDto(AlunosModel alunosModel) {		
		this.id = alunosModel.getId();
		this.cpf = alunosModel.getCpf();
		this.usuario = alunosModel.getUsuario();
		this.email = alunosModel.getEmail();
		this.nome = alunosModel.getNome();
		this.sobreNome = alunosModel.getSobreNome();
		this.idade = alunosModel.getIdade();
		this.curso = alunosModel.getCurso();
	}
	
	public static List<AlunoDto> convert(List<AlunosModel> alunosModels){
		return alunosModels.stream().map(AlunoDto::new).collect(Collectors.toList());
	}
	
}
