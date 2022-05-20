package com.api.PetGoapi.model.input;


import java.time.OffsetDateTime;

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
	private String email;
	private String login;
	private String senha;
	
}
