package com.soit.animal_encyclopedia.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="animal")
public class AnimalEncyclopedia {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="breed")
	private String Breed;
	
	@Column(name="gender")
	private String Gender;
	
	@Column(name="age")
	private String age;
	
	@Column(name="placeOfOrigin")
	private String placeOfOrigin;
	
	
	
	//Set the Constructors
	
	public AnimalEncyclopedia() {
		
		
	}


	public AnimalEncyclopedia(int id, String Breed, String Gender, String age, String placeOfOrigin) {
		this.id = id;
		this.Breed = Breed;
		this.Gender = Gender;
		this.age = age;
		this.placeOfOrigin = placeOfOrigin;
	}


	public AnimalEncyclopedia(int id, String Breed, String Gender, String placeOfOrigin) {
		this.id = id;
		this.Breed = Breed;
		this.Gender = Gender;
		this.placeOfOrigin = placeOfOrigin;
	}

	
	
	//Set the Getters and Setters

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBreed() {
		return Breed;
	}


	public void setBreed(String Breed) {
		this.Breed = Breed;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String Gender) {
		this.Gender = Gender;
	}


	public String getplaceOfOrigin() {
		return placeOfOrigin;
	}


	public void setplaceOfOrigin(String placeOfOrigin) {
		this.placeOfOrigin = placeOfOrigin;
	}

	
	//toString method

	public String getage() {
		return age;
	}


	public void setage(String age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "animal [id=" + id + ", Breed=" + Breed + ", Gender=" + Gender + ", age=" + age
				+ ", placeOfOrigin=" + placeOfOrigin + ", getId()=" + getId() + ", getBreed()=" + getBreed()
				+ ", getGender()=" + getGender() + ", getplaceOfOrigin()=" + getplaceOfOrigin() + ", getage()=" + getage()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}