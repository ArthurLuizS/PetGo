package com.api.PetGoapi.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoInput {
	private ClienteIdInput cliente;
	private String rua;
	private String numero;
	private String cep;
	private String cidade;
	private String estado;
}
