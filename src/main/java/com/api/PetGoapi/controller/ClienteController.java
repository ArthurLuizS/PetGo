package com.api.PetGoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.PetGoapi.Assembler.AnimalAssembler;
import com.api.PetGoapi.Assembler.ClienteAssembler;
import com.api.PetGoapi.Assembler.EnderecoAssembler;
//import com.api.PetGoapi.DTO.request.ClienteInput;
import com.api.PetGoapi.model.Animal;
//import com.api.PetGoapi.Assembler.ClienteAssembler;
import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.Endereco;
import com.api.PetGoapi.model.Output.ClienteOutput;
import com.api.PetGoapi.model.input.ClienteInput;
import com.api.PetGoapi.repository.ClienteRepository;
import com.api.PetGoapi.service.AnimalService;
import com.api.PetGoapi.service.ClienteService;
import com.api.PetGoapi.service.EnderecoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class ClienteController {
	
	//private ClienteAssembler clienteAssembler;
	@Autowired
	private ClienteService clienteService;
	private AnimalService animalService;
	private EnderecoService enderecoService;
	private ClienteAssembler clienteAssembler; 
	private EnderecoAssembler enderecoAssembler;
	private AnimalAssembler animalAssembler;
	private ClienteRepository clienteRepository;
	//private EnderecoDtoRequest enderecoDtoRequest;
@PostMapping	
public ResponseEntity<Cliente> cadastrar(@RequestBody ClienteInput clienteInput /*ClienteInput clienteInput*/){
		
	/*	if(!clienteDto.getSenha().contentEquals(clienteDto.getConfirmaSenha())) {
			return ResponseEntity.badRequest().build();
		} */
	Cliente newCliente = clienteService.save(clienteAssembler.toEntity(clienteInput));
	Endereco newEndereco = enderecoAssembler.toEntity(clienteInput.getEndereco()); 
	newEndereco.setCliente(newCliente);
	enderecoService.cadastrar(newEndereco);
	Animal newAnimal = animalAssembler.toEntity(clienteInput.getAnimal());
	newAnimal.setCliente(newCliente);
	animalService.cadastrar(newAnimal);
	
		return ResponseEntity.ok(newCliente);
	}
	@GetMapping("/usuarios")
	public List<ClienteOutput> listar(){
		return clienteAssembler.toCollectionModel(clienteRepository.findAll());
	
	}
	
	@GetMapping("{clienteId}")
	public ResponseEntity<ClienteOutput> buscar(@PathVariable Long clienteId){
		return clienteRepository.findById(clienteId)
		.map(cliente -> ResponseEntity.ok(clienteAssembler.toModel(cliente)))
		.orElse(ResponseEntity.notFound().build());
		

	}
}
