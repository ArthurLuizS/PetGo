package com.api.PetGoapi.controller;

import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.PetGoapi.ClienteAssembler;
import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.input.ClienteInput;
import com.api.PetGoapi.service.ClienteService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class UsuarioController {
	@Autowired
	private ClienteAssembler clienteAssembler;
	private ClienteService clienteService;
	
	@PostMapping
	private ResponseEntity<Cliente> cadastrar(@RequestBody ClienteInput clienteInput){
		Cliente novoCliente = clienteAssembler.toEntity(clienteInput);
		novoCliente.setDataCliente(OffsetDateTime.now());
		return ResponseEntity.ok(clienteService.save(novoCliente));
	}
}
