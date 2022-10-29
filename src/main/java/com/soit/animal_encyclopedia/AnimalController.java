package com.soit.animal_encyclopedia;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soit.animal_encyclopedia.entity.Vet_index;


@Controller
@RequestMapping("/Animal")
public class AnimalController {
	
	//Upload Faculty Info
		private List<Vet_index> theFaculties;
	
		@PostConstruct
		private void loadData() {
			
			
			//Create Faculties
			Vet_index fac1 = new Vet_index(1, "Cat", "Mammal");
			Vet_index fac2 = new Vet_index(2, "Dog", "Mammal");
			Vet_index fac3 = new Vet_index(3, "Fish", "Fish");
			Vet_index fac4 = new Vet_index(4, "Rabbit", "Mammal");
			Vet_index fac5 = new Vet_index(5, "Snake", "Reptiles");
			
			//Create our List
			theFaculties  = new ArrayList();
			
			//Add to our List
			theFaculties.add(fac1);
			theFaculties.add(fac2);
			theFaculties.add(fac3);
			theFaculties.add(fac4);
			theFaculties.add(fac5);
		}
		
		//Mapping for "/list"
		@GetMapping("/list")
		public String listFaculties(Model theModel) {
			
			
			//Add Faculties to the Spring Model
			theModel.addAttribute("faculties", theFaculties);
			
			return "list-faculties";
			
			
		}
		
		

}
