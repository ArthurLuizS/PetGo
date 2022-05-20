package com.api.PetGoapi.DTO.request;

import java.time.OffsetDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AnimalDtoRequest {

	private String nome;
	private String tipoAnimal;
	private OffsetDateTime dataNascimento;
	private Float peso;
	private String porte;
	private String sexo;
	private String observacoes;
	private String raca;
}
