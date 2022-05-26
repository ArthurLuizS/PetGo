package com.api.PetGoapi.Assembler;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.Endereco;
import com.api.PetGoapi.model.input.EnderecoInput;

@Component
public class EnderecoAssembler {
	@Autowired
	public ModelMapper modelMapper;
	
	public Endereco toEntity(EnderecoInput enderecoInput) {
		return modelMapper.map(enderecoInput, Endereco.class);
	}
}
