package pl.coderslab.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.entities.Animal;
import pl.coderslab.repositories.AnimalRepository;

@Controller
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	AnimalRepository animalRepository;
	
	@GetMapping("/add")
	public String formAnimal(Model model) {
		model.addAttribute("animal", new Animal());
		return "addanimal";
	}
	
	@PostMapping("/add")
	public String processFormAnimal(@Valid Animal animal, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "tagform";
		} else {
			animalRepository.save(animal);
			return "addedanimal";
		}
	}
	
	@GetMapping("/all")
	public String showAllAnimals(Model model) {
		model.addAttribute("animals", animalRepository.findAll());
		return "allanimals";
	}
}
