package com.soit.animal_encyclopedia;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soit.animal_encyclopedia.model.Faculty;


@Controller
@RequestMapping("/Faculties")
public class FacultyController {
	
	//Upload Faculty Info
		private List<Faculty> theFaculties;
	
		@PostConstruct
		private void loadData() {
			
			
			//Create Faculties
			Faculty fac1 = new Faculty(1, "Cat", "Mammal");
			Faculty fac2 = new Faculty(2, "Dog", "Mammal");
			Faculty fac3 = new Faculty(3, "Fish", "Fish");
			
			//Create our List
			theFaculties  = new ArrayList();
			
			//Add to our List
			theFaculties.add(fac1);
			theFaculties.add(fac2);
			theFaculties.add(fac3);
		}
		
		//Mapping for "/list"
		@GetMapping("/list")
		public String listFaculties(Model theModel) {
			
			
			//Add Faculties to the Spring Model
			theModel.addAttribute("faculties", theFaculties);
			
			return "list-faculties";
			
			
		}
		
		

}
