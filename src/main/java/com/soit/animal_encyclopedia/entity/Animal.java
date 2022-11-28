package com.soit.animal_encyclopedia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="animal")
public class Animal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Column(name="info")
	private String info;
	
	@Column(name="origin")
	private String origin;
	
	@Column(name="feed")
	private String feed;
	
public Animal() {
		
		
	}

public Animal(int id, String name, String type) {
	this.id = id;
	this.name = name;
	this.type = type;
}

public Animal(int id, String name, String type, String info, String origin, String feed) {
	this.id = id;
	this.name = name;
	this.type = type;
	this.info = info;
	this.origin = origin;
	this.feed = feed;
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

public String getInfo() {
	return info;
}

public void setInfo(String info) {
	this.info = info;
}

public String getOrigin() {
	return origin;
}

public void setVaccine(String origin) {
	this.origin = origin;
}


public String getFeed() {
	return feed;
}

public void setFeed(String feed) {
	this.feed = feed;
}

@Override
public String toString() {
	return "Animal [id=" + id + ", name=" + name + ", type=" + type + ", info=" + info + ", origin=" + origin + ", feed=" + feed
			+ ", getId()=" + getId() + ", getName()=" + getName() + ", getType()=" + getType() + ", getInfo()=" + getInfo() + ",getOrigin()=" + getOrigin() + ",getFeed()=" + getFeed()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}
}
