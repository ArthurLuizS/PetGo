package com.api.PetGoapi.Assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import com.api.PetGoapi.DTO.request.ClienteInput;
import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.Output.ClienteOutput;
import com.api.PetGoapi.model.input.ClienteInput;

@Component
public class ClienteAssembler {
	@Autowired
	public ModelMapper modelMapper;
	
	
	public Cliente toEntity(ClienteInput clienteInput) {
		return modelMapper.map(clienteInput, Cliente.class);
	}
	
	
	public ClienteOutput toModel(Cliente cliente) {
		
		return modelMapper.map(cliente, ClienteOutput.class);
	}
	
	public List<ClienteOutput> toCollectionModel (List<Cliente> cliente){
		return cliente.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}
}
