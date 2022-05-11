package com.api.PetGoapi.model.input;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteInput {

	private EnderecoInput endereco;
	private IdentificacaoInput identificacao;
	private LoginInput login;
}
