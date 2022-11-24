package com.soit.animal_encyclopedia;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.soit.animal_encyclopedia.entity.Animal;
import com.soit.animal_encyclopedia.service.AnimalService;

@Controller
@RequestMapping("/Animals")
public class AnimalController {
	
	public AnimalService animalService;
	
	public AnimalController (AnimalService theAnimalService){
		animalService = theAnimalService;
	}
	
	//Mapping for "/list"
	@GetMapping("/list")
	public String listAnimals(Model theModel) {
		
		//Retrieve animals from the Database
		List<Animal> theAnimals = animalService.findAll();
		
		//Add Animals to the Spring Model
		theModel.addAttribute("animals", theAnimals);
		
		return "animals/list-animals";
	}

	@GetMapping("/viewAddForm")
	public String viewAddForm(Model theModel) {
		
		//Model attribute for data binding
		Animal theAnimal = new Animal();
		
		theModel.addAttribute("animal", theAnimal);
		
		return "animals/animal-form";
	}
	
	@GetMapping("/viewUpdateForm")
	public String viewUpdateForm(@RequestParam("animalId") int theId, Model theModel) {
		
		//Retrieve the animal info from  the service layer
		Animal theAnimal = animalService.findById(theId);
		
		//Pre-populate the form by setting the animal as a model attribute
		theModel.addAttribute("animal", theAnimal);
		
		//Redirect us to the animal form
		return "animals/animal-form";
	}
		
	@PostMapping("/save")
	public String saveAnimal(@ModelAttribute("animal") Animal theAnimal) {
		
		//Register the Animal
		animalService.save(theAnimal);
		
		//Block duplicates submission for accidental refresh
		return "redirect:/Animals/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("animalId") int theId) {
		
		//Remove Animal
		animalService.deleteById(theId);
	
		//Return to the Animals directory
		return "redirect:/Animals/list";
	}
}
