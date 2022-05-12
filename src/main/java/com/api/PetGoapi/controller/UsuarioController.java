package com.api.PetGoapi.controller;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.api.PetGoapi.Assembler.ClienteAssembler;
import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.input.ClienteInput;
import com.api.PetGoapi.service.ClienteService;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class UsuarioController {
	
	//private ClienteAssembler clienteAssembler;
	
	private ClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente /*ClienteInput clienteInput*/){
	//	Cliente novoCliente = clienteAssembler.toEntity(clienteInput);
		
		cliente.setDataCliente(OffsetDateTime.now());
		return ResponseEntity.ok(clienteService.save(cliente));
	}
	@GetMapping("/usuarios")
	public ResponseEntity<List<Cliente>> listar(){
		return ResponseEntity.ok(clienteService.listar());
	}
}
