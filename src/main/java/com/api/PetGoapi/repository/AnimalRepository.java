package com.api.PetGoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.PetGoapi.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
