package com.api.PetGoapi.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginInput {
	private String login;
	private String senha;
	private String confirmaSenha;

	
}
