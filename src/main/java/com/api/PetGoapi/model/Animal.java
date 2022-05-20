package com.api.PetGoapi.model;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode
public class Animal {
	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Cliente cliente;
	@Column(name = "nome_animal")
	private String nome;
	@Column(name = "tipo_animal")
	private String tipoAnimal;
	@Column(name = "data_nascimento")
	private OffsetDateTime dataNascimento;
	@Column(name = "peso_animal")
	private Float peso;
	@Column(name = "porte_animal")
	private String porte;
	private String sexo;
	private String observacoes;
	private String raca;
}
