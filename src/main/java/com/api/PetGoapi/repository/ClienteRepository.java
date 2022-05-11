package com.api.PetGoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.PetGoapi.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
