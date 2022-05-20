package com.api.PetGoapi.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class Servico {
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private String nomeServico;
	private String descricaoServico;
}
