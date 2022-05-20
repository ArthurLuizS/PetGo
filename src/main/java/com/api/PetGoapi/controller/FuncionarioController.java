package com.api.PetGoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.PetGoapi.model.Funcionario;
import com.api.PetGoapi.repository.FuncionarioRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@PostMapping("/")
	public Funcionario cadastrar(@RequestBody Funcionario novoFuncionario) {
		
		return funcionarioRepository.save(novoFuncionario);
		
	}
}
