package com.rodrigo.Escola.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CursosModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column @NotEmpty @NotNull
	private String curso;
	
	@Column @NotEmpty @NotNull
	private LocalDate dataInicio;
	
	@Column 
	private LocalDate dataConclusao;
	
	@Column 
	private Long nota;
	
	@ManyToOne
	private AlunosModel alunosModel;
	
	//many to one - muitos pra um
	//one to many - um para todos
	//one to on - um para um
	//many to many - muitos para muitos
}
