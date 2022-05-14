package com.api.PetGoapi.DTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.input.ClienteInput;
/*
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Component
public class ClienteAssembler {
	@Autowired
	public ModelMapper modelMapper;
	
	public 	Cliente toEntity(ClienteInput clienteInput) {
		return modelMapper.map(clienteInput, Cliente.class);
	}

}
*/