package com.rodrigo.Escola.model;

import java.util.Objects;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.http.HttpStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class AlunosModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column @NotNull @NotEmpty @Length(max = 25)
	private String usuario;
	
	@NotNull @NotEmpty @CPF @Column
	private String cpf;
	
	@Email @Column 
	private String email;
	
	@Column
	private String senha;
	
	@Column
	private String nome;
	
	@Column
	private String sobreNome;
	
	@Column
	private Integer idade;
	
	@Column
	private String curso;
	
	


}
