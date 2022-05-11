package com.api.PetGoapi.model;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Endereco {

	private String rua;
	private String numero;
	private String cep;
	private String cidade;
	private String estado;
}
