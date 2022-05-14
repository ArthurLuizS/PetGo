package com.api.PetGoapi.DTO.request;

import java.time.OffsetDateTime;

import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.model.Endereco;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String login;
	private String senha;
	private String confirmaSenha;
	private Endereco endereco;
	
	public Cliente build() {
		Cliente cliente = new Cliente().setNome(this.nome)
										.setDataCliente(OffsetDateTime.now())
										.setCpf(this.cpf)
										.setEmail(this.email)
										.setLogin(this.login)
										.setSenha(this.senha)
										.setTelefone(this.telefone)
										.setEndereco(endereco);
		return cliente;
	}
}
