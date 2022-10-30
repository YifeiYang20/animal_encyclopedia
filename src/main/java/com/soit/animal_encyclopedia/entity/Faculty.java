package com.soit.animal_encyclopedia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//The file is name faculty still (Might be from our class and that is ok I did the same with ours.
//I would recommend to change to a other name like Encyclopedia
@Entity
@Table(name="faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	//I noticed that on controller this has categories like Mammal, Fish and etc. What if you changed this to Species?
	@Column(name="type")
	private String type;
	
public Faculty() {
		
		
	}

public Faculty(int id, String name, String type) {
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
	return "Faculty [id=" + id + ", name=" + name + ", type=" + type + "]";
}
}
