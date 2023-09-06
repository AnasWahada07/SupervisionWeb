package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.Service.VilleService;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.entities.Ville;

@RestController
@CrossOrigin("*")
public class VilleController {

	@Autowired
	private VilleService villeService;

	@PostMapping("/addville")
	public Ville AddVille(@RequestBody Ville ville) {

		return villeService.addVille(ville);

	}

	@GetMapping("/VilleById/{idv}")
	public Ville VilleById(@PathVariable("idv") Long id){
		return villeService.GetVilleById(id);
	}


	@GetMapping("/AllVille")
	@ResponseBody
	public List<Ville> GetAllVille() {
		return villeService.GetAllVille();


	}

	@DeleteMapping("/deleteVille/{idville}")
	public void deleteVille(@PathVariable("idville") Long id) {
		villeService.deleteVille(id);
	}


	@PutMapping("/villeupdate/{id}")
	public Ville updatePerson(@PathVariable Long id, @RequestBody Ville updated) {
		return villeService.UpdateVille(id, updated);
	}

}



	
	
	
    