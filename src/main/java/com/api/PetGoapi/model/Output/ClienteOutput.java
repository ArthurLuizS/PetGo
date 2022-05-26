package com.api.PetGoapi.model.Output;

import java.util.List;

import lombok.Data;

@Data
public class ClienteOutput {
	private Long id;
	private String nomeCliente;	
	private List<AnimalOutput> animal;
	private List<EnderecoOutput> endereco;
}
