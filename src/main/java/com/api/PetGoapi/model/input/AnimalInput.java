package com.api.PetGoapi.model.input;

import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class AnimalInput {
	private ClienteIdInput cliente;
	private String nome;
	private String tipoAnimal;
	private OffsetDateTime dataNascimento;
	private Float peso;
	private String porte;
	private String sexo;
	private String observacoes;
	private String raca;
}
