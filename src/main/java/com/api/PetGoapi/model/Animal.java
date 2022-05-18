package com.api.PetGoapi.model;

import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class Animal {
	private Long id;
	private String nome;
	private OffsetDateTime dataNascimento;
	private Float peso;
	private String porte;
	private String sexo;
	private String observaçoes;
}
