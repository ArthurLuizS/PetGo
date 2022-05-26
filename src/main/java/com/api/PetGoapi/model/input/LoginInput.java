package com.api.PetGoapi.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginInput {
	private ClienteIdInput cliente;
	private String email;
	private String senha;

	
}
