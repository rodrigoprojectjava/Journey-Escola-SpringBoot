package com.rodrigo.Escola.model;

import java.util.Objects;

import org.springframework.http.HttpStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AlunosModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String usuario;
	
	@Column
	private String senha;
	
	@Column 
	private String email;
	
	@Column
	private String nome;
	
	@Column
	private String sobreNome;
	
	@Column
	private Integer idade;
	
	@Column
	private String curso;

}
