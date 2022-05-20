package com.api.PetGoapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.PetGoapi.model.Endereco;
import com.api.PetGoapi.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	EnderecoRepository enderecoRepository;
	
	public Endereco cadastrar (Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
}
