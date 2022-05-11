package com.api.PetGoapi.model;

import javax.persistence.Embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Usuario {
	private String nome;
	private String telefone;
	private String email;
	private String senha;
	@Embedded
	private Endereco endereco;
	
	
}
