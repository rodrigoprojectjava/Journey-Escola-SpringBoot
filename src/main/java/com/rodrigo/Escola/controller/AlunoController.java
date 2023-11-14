package com.rodrigo.Escola.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.rodrigo.Escola.dto.AlunoDto;
import com.rodrigo.Escola.model.AlunosModel;
import com.rodrigo.Escola.repository.AlunosRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunosRepository repositoryAlunos;
	
	
	@GetMapping
	public List<AlunoDto> listaAlunos(){
		List<AlunosModel> alunosModels = repositoryAlunos.findAll();
		return AlunoDto.convert(alunosModels);
	}
	
	@GetMapping("/{id}")
	public AlunosModel AlunoId(@PathVariable Long id) {
		return repositoryAlunos.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id Inexistente"));
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public AlunosModel add (@RequestBody AlunosModel alunos) {
		return repositoryAlunos.save(alunos);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<AlunosModel> update(@PathVariable Long id, @RequestBody AlunosModel alunos){
		
		if(!repositoryAlunos.existsById(id)){
			return ResponseEntity.notFound().build();			
		}
		alunos.setId(id);
		alunos = repositoryAlunos.save(alunos);
		return ResponseEntity.ok(alunos);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete (@PathVariable Long id){
		
		if(!repositoryAlunos.existsById(id)){
			return ResponseEntity.notFound().build();			
		}
		repositoryAlunos.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}
