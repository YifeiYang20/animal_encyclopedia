package com.soit.animal_encyclopedia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soit.animal_encyclopedia.dao.AnimalEncyclopediaRepository;
import com.soit.animal_encyclopedia.entity.Animal;


@Service
public class AnimalServiceImpl implements AnimalService {
	
	
	private AnimalEncyclopediaRepository animalRepository;
	
	@Autowired
	public AnimalServiceImpl (AnimalEncyclopediaRepository theanimalRepository) {
		animalRepository = theanimalRepository;
	}
	

	@Override
	public List<Animal> findAll() {
		// TODO Auto-generated method stub
		return animalRepository.findAllByOrderByBreed();
	}

	@Override
	public Animal findById(int theId) {
	
		Optional<Animal> Animalid = animalRepository.findById(theId);
		
		Animal theAnimal = null;
		
		if(Animalid.isPresent()) {
			theAnimal = Animalid.get();
			
			
			
		}
		else
		{
			
			//Animal not found
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