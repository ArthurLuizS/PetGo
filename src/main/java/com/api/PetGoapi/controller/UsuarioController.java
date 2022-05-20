package com.api.PetGoapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.PetGoapi.DTO.request.ClienteDto;
import com.api.PetGoapi.DTO.request.EnderecoDtoRequest;
import com.api.PetGoapi.model.Animal;
//import com.api.PetGoapi.Assembler.ClienteAssembler;
import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.Endereco;
import com.api.PetGoapi.service.AnimalService;
import com.api.PetGoapi.service.ClienteService;
import com.api.PetGoapi.service.EnderecoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class UsuarioController {
	
	//private ClienteAssembler clienteAssembler;
	@Autowired
	private ClienteService clienteService;
	private AnimalService animalService;
	private EnderecoService enderecoService;
	//private EnderecoDtoRequest enderecoDtoRequest;
	
	@PostMapping
	public ResponseEntity<Cliente> cadastrar(@RequestBody ClienteDto clienteDto /*ClienteInput clienteInput*/){
		
		if(!clienteDto.getSenha().contentEquals(clienteDto.getConfirmaSenha())) {
			return ResponseEntity.badRequest().build();
		}
		Cliente clienteSalvo = clienteService.save(clienteDto.build()) ;
		Animal animalSalvo = clienteDto.buildAnimal(clienteDto.getAnimais().get(0));
		animalSalvo.setCliente(clienteSalvo);
		animalService.cadastrar(animalSalvo);
		EnderecoDtoRequest enderecoDtoRequest = new EnderecoDtoRequest();
		Endereco enderecoSalvo = enderecoDtoRequest.build(clienteDto.getEndereco());
		enderecoSalvo.setCliente(clienteSalvo);
		enderecoService.cadastrar(enderecoSalvo);
		
		
		return ResponseEntity.ok(clienteSalvo);
	}
	@GetMapping("/usuarios")
	public ResponseEntity<List<Cliente>> listar(){
		return ResponseEntity.ok(clienteService.listar());
	}
	
	@GetMapping("{clienteId}")
	public ResponseEntity<Optional<Cliente>> buscar(@PathVariable Long clienteId){
		
		return ResponseEntity.ok(clienteService.buscar(clienteId));
	}
}
