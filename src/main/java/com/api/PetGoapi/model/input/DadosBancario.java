package com.api.PetGoapi.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DadosBancario {
	private String titular;
	private String cpfTitular;
	private String numeroConta;
	private String tipoConta;
}
