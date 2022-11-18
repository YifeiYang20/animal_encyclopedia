package com.soit.animal_encyclopedia.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soit.animal_encyclopedia.entity.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
	
	public List<Animal>findAllByOrderByName();

}
