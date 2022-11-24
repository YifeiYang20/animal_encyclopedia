package com.soit.animal_encyclopedia.service;

import java.util.List;

import com.soit.animal_encyclopedia.entity.Animal;

public interface AnimalService {
	 public List<Animal>findAll();	 
	 public Animal findById(int theId);		 
	 public void save(Animal theAnimal);		 
	 public void deleteById(int theId);
}
