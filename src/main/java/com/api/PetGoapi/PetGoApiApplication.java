package com.api.PetGoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.PetGoapi.model.Endereco;
import com.api.PetGoapi.model.Usuario;

import lombok.AllArgsConstructor;

@SpringBootApplication
public class PetGoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetGoApiApplication.class, args);
	}
	
	
}
