package com.api.PetGoapi.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Conta {
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private String numeroConta;
	private String titularCpf;
	private String titularNome;
	private String tipo;
}
