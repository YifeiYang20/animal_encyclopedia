package com.soit.animal_encyclopedia;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soit.animal_encyclopedia.entity.Animal;


@Controller
@RequestMapping("/Animals")
public class AnimalController {
	
	//Upload Faculty Info
		private List<Animal> theAnimals;
	
		@PostConstruct
		private void loadData() {
			
			
			//Create Faculties
			Animal animal1 = new Animal(1, "Cat", "Mammal");
			Animal animal2 = new Animal(2, "Dog", "Mammal");
			Animal animal3 = new Animal(3, "Fish", "Fish");
			Animal animal4 = new Animal(4, "Rabbit", "Mammal");
			Animal animal5 = new Animal(5, "Snake", "Reptiles");
			
			//Create our List
			theAnimals  = new ArrayList();
			
			//Add to our List
			theAnimals.add(animal1);
			theAnimals.add(animal2);
			theAnimals.add(animal3);
			theAnimals.add(animal4);
			theAnimals.add(animal5);
		}
		
		//Mapping for "/list"
		@GetMapping("/list")
		public String listAnimals(Model theModel) {
			
			
			//Add Faculties to the Spring Model
			theModel.addAttribute("animals", theAnimals);
			
			return "list-animals";
			
			
		}
		
		

}
