package com.api.PetGoapi.Assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.PetGoapi.model.Animal;
import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.input.AnimalInput;

@Component
public class AnimalAssembler {
	@Autowired
	public ModelMapper modelMapper;
	
	public Animal toEntity(AnimalInput animalInput) {
		return modelMapper.map(animalInput, Animal.class);
	}
}
