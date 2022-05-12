package com.api.PetGoapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteService {

	private ClienteRepository clienteRepository;
	
	@Transactional
	public Cliente save(Cliente novoCliente) {
		
		return clienteRepository.save(novoCliente);
	}

	public List<Cliente> listar() {
	
		return clienteRepository.findAll();
	}
}
