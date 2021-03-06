package com.api.PetGoapi.model;

import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
//@DiscriminatorValue("funcionario")
public class Funcionario {
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String telefone;
	private String login;
	private String email;
	private String senha;
	private String cpf;
	//private List<Conta> contas;
//	private List<Servico> servicos;
	
	/*
	public Conta novaConta(Conta conta) {
		Conta novaConta = new Conta();
		novaConta.setNumeroConta(conta.getNumeroConta());
		novaConta.setTipo(conta.getTipo());
		novaConta.setTitularCpf(conta.getTitularNome());
		novaConta.setTitularCpf(conta.getTitularCpf());
		return novaConta;
		
	} */
}
