package com.soit.animal_encyclopedia.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soit.animal_encyclopedia.entity.AnimalEncyclopedia;

public interface AnimalEncyclopediaRepository extends JpaRepository<AnimalEncyclopedia, Integer> {
	public List<AnimalEncyclopedia>findAllByOrderByLastName();
	

}