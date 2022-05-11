package com.api.PetGoapi.model;

import javax.persistence.Embedded;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Funcionario {
	private String nome;
	private String telefone;
	private String email;
	private String senha;
	@Embedded
	private Endereco endereco;
	private Long id;
	private String numeroconta;
}
