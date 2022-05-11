package com.api.PetGoapi.model;

import javax.persistence.Embedded;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente{
	private String nome;
	private String telefone;
	private String email;
	private String senha;
	@Embedded
	private Endereco endereco;
	

}
