package com.api.PetGoapi.DTO.response;

import java.util.Optional;

import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.Endereco;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ClienteResponseDto {

	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private Endereco endereco;
	public ClienteResponseDto(Cliente cliente) {
		this.nome = cliente.getNome();
		this.cpf = cliente.getCpf();
		this.telefone = cliente.getTelefone();
		this.email = cliente.getEmail();
		this.endereco = cliente.getEndereco();
	}
	public ClienteResponseDto(Optional<Cliente> cliente) {
		this.nome = cliente.get().getNome();
		this.cpf = cliente.get().getCpf();
		this.telefone = cliente.get().getTelefone();
		this.email = cliente.get().getEmail();
		this.endereco = cliente.get().getEndereco();
	}
	
	
}
