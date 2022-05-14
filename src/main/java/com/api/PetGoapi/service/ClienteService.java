package com.api.PetGoapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.PetGoapi.DTO.request.ClienteDto;
import com.api.PetGoapi.DTO.response.ClienteResponseDto;
import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.input.ClienteInput;
import com.api.PetGoapi.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteService {

	private ClienteRepository clienteRepository;
	
	
	@Transactional
	public ClienteResponseDto save(Cliente novoCliente) {
		 return new ClienteResponseDto(clienteRepository.save(novoCliente));
		
	}

	public List<Cliente> listar() {
	
		return clienteRepository.findAll();
	}
	@Transactional
	public ClienteResponseDto buscar(Long clienteId) {
		return new ClienteResponseDto(clienteRepository.findById(clienteId));
	}
}
