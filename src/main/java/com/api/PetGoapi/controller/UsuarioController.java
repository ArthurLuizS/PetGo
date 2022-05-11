package com.api.PetGoapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.PetGoapi.ClienteAssembler;
import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.Endereco;
import com.api.PetGoapi.model.Funcionario;
import com.api.PetGoapi.model.Usuario;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class UsuarioController {
	
	private ClienteAssembler clienteAssembler;
	
	
	@GetMapping("usuarios")
	public ResponseEntity<Cliente> index() {
		Cliente novocliente = new Cliente("Arthur", "Arthur@email");
		novocliente.setNome("juan");
		novocliente.setNumeroconta("11111");
		
		
		
		return ResponseEntity.ok(novocliente);
	}
}
