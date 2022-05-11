package com.api.PetGoapi.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.repository.ClienteRepository;

@Service
public class ClienteService {

	private ClienteRepository clienteRepository;
	
	@Transactional
	public Cliente save(Cliente novoCliente) {
		
		return clienteRepository.save(novoCliente);
	}
}
