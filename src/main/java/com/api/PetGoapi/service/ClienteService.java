package com.api.PetGoapi.service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.PetGoapi.model.Cliente;
import com.api.PetGoapi.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteService {

	private ClienteRepository clienteRepository;
//	private UsuarioRepository usuarioRepository;
	
	
	@Transactional
	public Cliente save(Cliente novoCliente) {
	/*	Usuario novoUsuario = new Usuario();
		novoUsuario.setEmail(novoCliente.getEmail());
		novoUsuario.setEndereco(novoCliente.getEndereco());
		novoUsuario.setLogin(novoCliente.getLogin());
		novoUsuario.setNome(novoCliente.getNome());
		novoUsuario.setSenha(novoCliente.getSenha());
		novoUsuario.setTelefone(novoCliente.getTelefone());
		usuarioRepository.save(novoUsuario); */
		novoCliente.setDataCliente(OffsetDateTime.now());
//		 return new ClienteResponseDto(clienteRepository.save(novoCliente));
		 return clienteRepository.save(novoCliente);
	}

	public List<Cliente> listar() {
	
		return clienteRepository.findAll();
	}
	@Transactional
	public Optional<Cliente> buscar(Long clienteId) {
		//falta implementar
		//return new ClienteResponseDto(clienteRepository.findById(clienteId));
		return clienteRepository.findById(clienteId);
	}
}
