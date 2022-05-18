package com.api.PetGoapi.model;

import java.time.OffsetDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
@Accessors(chain = true)
@Entity
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
@DiscriminatorValue("Cliente")
public class Cliente extends Usuario{
/*	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; */
	private OffsetDateTime dataCliente;
//	private String nome;
	private String cpf;
	private String nomeCao;
//	private String telefone;
//	private String email;
//	private String login;
//	private String senha;
	
//	private Endereco endereco;
	

}