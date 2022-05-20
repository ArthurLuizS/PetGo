package com.api.PetGoapi.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
@Accessors(chain = true)
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
@DiscriminatorValue("Cliente")
public class Cliente extends Usuario{

//	private OffsetDateTime dataCliente;
//	private String cpf;

	
@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)	
private List<Animal> animais = new ArrayList<>();

@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)	
private List<Endereco> endereco = new ArrayList<>();
	
	public Animal cadastrar(Animal novoAnimal) {
		Animal animal = new Animal();
		animal.setNome(novoAnimal.getNome());
		
		return animal;
		}
		 
	
}
	

