package com.api.PetGoapi.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.PetGoapi.model.Animal;
import com.api.PetGoapi.repository.AnimalRepository;

@Service
public class AnimalService {
	@Autowired
	AnimalRepository animalRepository;
	
	
	@Transactional
	public Animal cadastrar(Animal animal) {
		animalRepository.save(animal);
		return null;
	}
}
