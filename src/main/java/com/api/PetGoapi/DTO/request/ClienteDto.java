package com.api.PetGoapi.DTO.request;

import java.util.List;

import com.api.PetGoapi.model.Animal;
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
	private EnderecoDtoRequest endereco;
	private List<Animal> animais;

	
	public Cliente build() {
		Cliente cliente = new Cliente(); 
		cliente.setNome(this.nome);
										//.setDataCliente(OffsetDateTime.now())
		cliente.setCpf(this.cpf)
										.setEmail(this.email)
										.setLogin(this.login)
										.setSenha(this.senha)
										.setTelefone(this.telefone)
								//		.setEndereco(endereco);
										;
		return cliente;//.setAnimais(this.animais);
	}
	
	public Animal buildAnimal(Animal animal) {
		Animal animalnovo = new Animal();
		animalnovo.setDataNascimento(animal.getDataNascimento());
		animalnovo.setNome(animal.getNome());
		animalnovo.setObservacoes(animal.getObservacoes());
		animalnovo.setPeso(animal.getPeso());
		animalnovo.setPorte(animal.getPorte());
		animalnovo.setRaca(animal.getRaca());
		animalnovo.setSexo(animal.getSexo());
		
		return animalnovo;
		
	}
	
	
	
}
