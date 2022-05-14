package com.api.PetGoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.PetGoapi.DTO.request.ClienteDto;
//import com.api.PetGoapi.Assembler.ClienteAssembler;
import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.service.ClienteService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class UsuarioController {
	
	//private ClienteAssembler clienteAssembler;
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<Cliente> cadastrar(@RequestBody ClienteDto clienteDto /*ClienteInput clienteInput*/){
		//Cliente novoCliente = clienteAssembler.toEntity(clienteDto);
	//	novoCliente.setDataCliente(OffsetDateTime.now());
	//	clienteInput.setDataCliente(OffsetDateTime.now());
		
	//	cliente.setDataCliente(OffsetDateTime.now());
		if(!clienteDto.getSenha().contentEquals(clienteDto.getConfirmaSenha())) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(clienteService.save(clienteDto.build()));
	}
	@GetMapping("/usuarios")
	public ResponseEntity<List<Cliente>> listar(){
		return ResponseEntity.ok(clienteService.listar());
	}
}
