package com.wecancodeit.carlistings.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.wecancodeit.carlistings.models.Auto;
import com.wecancodeit.carlistings.repositories.AutosRepository;

@Controller
public class HomeController {

	@Resource
	AutosRepository repo; 

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/autos")
	public String getAutoForm(Model model) {
		model.addAttribute("autos", repo.findAll());
		return "autos/add";
	}

	@GetMapping("autos/{id}")
	public String getAuto(@PathVariable Long id, Model model) {
		model.addAttribute("auto", repo.findById(id).get());
		return "/autos/individual";
	}
	@PostMapping("/autos/add")
	public String addAuto(String make, String model, String color, String mileage, int price) {
		repo.save(new Auto(make, model, color, mileage, price));
		return "redirect:/autos";
	}

}
