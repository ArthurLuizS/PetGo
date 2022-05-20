package com.api.PetGoapi.DTO.request;

import com.api.PetGoapi.model.Endereco;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class EnderecoDtoRequest {

	private String rua;
	private String numero;
	private String cep;
	private String cidade;
	private String estado;
	
	public Endereco build(EnderecoDtoRequest endereco) {
		Endereco endereconovo = new Endereco();
		endereconovo.setCep(endereco.getCep());
		endereconovo.setCidade(endereco.getCidade());
		endereconovo.setEstado(endereco.getEstado());
		endereconovo.setNumero(endereco.getNumero());
		endereconovo.setRua(endereco.getRua());
		return endereconovo;
		
	}
}
