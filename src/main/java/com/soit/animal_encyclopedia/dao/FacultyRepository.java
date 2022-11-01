package com.soit.animal_encyclopedia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soit.animal_encyclopedia.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

}
