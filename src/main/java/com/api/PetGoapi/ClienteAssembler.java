package com.api.PetGoapi;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.input.ClienteInput;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ClienteAssembler {
	public ModelMapper modelMapper;
	
	public Cliente toEntity(ClienteInput clienteInput) {
		return modelMapper.map(clienteInput, Cliente.class);
	}
}
