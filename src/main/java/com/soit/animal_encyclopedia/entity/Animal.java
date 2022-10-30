package com.soit.animal_encyclopedia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="animals")
public class Animal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
public Animal() {
		
		
	}

public Animal(int id, String name, String type) {
	this.id = id;
	this.name = name;
	this.type = type;
}

public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}


public String getType() {
	return type;
}



public void setType(String type) {
	this.type = type;
}

@Override
public String toString() {
	return "Animal [id=" + id + ", name=" + name + ", type=" + type + "]";
}
}
