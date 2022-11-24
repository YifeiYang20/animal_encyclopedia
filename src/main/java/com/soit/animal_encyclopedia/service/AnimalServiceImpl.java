package com.soit.animal_encyclopedia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soit.animal_encyclopedia.dao.AnimalRepository;
import com.soit.animal_encyclopedia.entity.Animal;


@Service
public class AnimalServiceImpl implements AnimalService {
	private AnimalRepository animalRepository;
	
	@Autowired
	public AnimalServiceImpl (AnimalRepository theAnimalRepository) {
		animalRepository = theAnimalRepository;
	}
	
	@Override
	public List<Animal> findAll() {
		// TODO Auto-generated method stub
		return animalRepository.findAllByOrderByName();
	}

	@Override
	public Animal findById(int theId) {
		Optional<Animal> animalid = animalRepository.findById(theId);	
		Animal theAnimal = null;	
		if(animalid.isPresent()) {
			theAnimal = animalid.get();		
		}
		else
		{		
			//animal not found
			throw new RuntimeException("The AnimalId you've entered is invalid - " + theId);
		}

		return theAnimal;
	}

	@Override
	public void save(Animal theAnimal) {
		animalRepository.save(theAnimal);
	}

	@Override
	public void deleteById(int theId) {
		animalRepository.deleteById(theId);
	}
}
