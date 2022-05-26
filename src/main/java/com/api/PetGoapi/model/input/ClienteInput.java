package com.api.PetGoapi.model.input;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteInput {
	/*private String nome;
	private EnderecoInput endereco;
	private IdentificacaoInput identificacao;
	private LoginInput login;
	private String telefone;*/
	
	private String nome;
	private String cpf;
	private String telefone;
	private String login;
	private String email;
	private String senha;
	private EnderecoInput endereco;
	private AnimalInput animal;
	
}
