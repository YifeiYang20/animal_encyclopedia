package com.soit.animal_encyclopedia;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.soit.animal_encyclopedia.entity.animalulty;


@Controller
@RequestMapping("/Animal")
public class AnimalEncyclopediaController {
	
	//Upload animalulty Info
		private List<Animal> theAnimal;
	
		@PostConstruct
		private void loadData() {
			
			
			//Create animalulties
			Animal animal1 = new Animal(1, "Cat", "Mammal");
			Animal animal2 = new Animal(2, "Dog", "Mammal");
			Animal animal3 = new Animal(3, "Fish", "Fish");
			Animal animal4 = new Animaly(4, "Rabbit", "Mammal");
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
		
		

		@Controller
		@RequestMapping("/Animals")
		public class AnimalController {
			
			
			public animalService animalService;
			
			public AnimalController (animalService theanimalService){
				animalService = theanimalService;
			}
			
			//Mapping for "/list"
			@GetMapping("/list")
			public String listAnimals(Model theModel) {
				
				
				//Retrieve Animals from the Database
				List<Animal> theAnimals = animalService.findAll();
				
				
				//Add Animals to the Spring Model
				theModel.addAttribute("Animals", theAnimals);
				
				return "Animals/list-Animals";
				
				
			}

			@GetMapping("/viewAddForm")
			public String viewAddForm(Model theModel) {
				
				
				
				//Model attribute for data binding
				Animal theAnimal = new Animal();
				
				theModel.addAttribute("Animal", theAnimal);
				
				
				return "Animals/Animal-form";
				
			}
			
			
			@GetMapping("/viewUpdateForm")
			public String viewUpdateForm (@RequestParam("AnimalId") int theId, Model theModel) {
				
				
				
				//Retrieve the Animal info from the service layer
				Animal theAnimal = animalService.findById(theId);
				
				
				
				
				//Pre-populate the form by setting the Animal as a model attribute
				theModel.addAttribute("Animal", theAnimal);
				
				
				
				//Redirect us to the Animal form
				return "Animals/Animal-form";
				
				
				
				
			}
			
			
			
			@PostMapping("/save")
			public String saveAnimal(@ModelAttribute("Animal") Animal theAnimal) {
				
				
				
				//Register the Animal
				animalService.save(theAnimal);
				
				
				//Block duplicates submission for accidental refresh
				return "redirect:/Animals/list";
				
			}
			
			@GetMapping("/delete")
			public String delete(@RequestParam("AnimalId") int theId) {
				
				
				//Remove Animal
				animalService.deleteById(theId);
				
				
				//Return to the Animals' directory
				return "redirect:/Animals/list";
				
				
				
				
			}
			
		}
		
		

}
