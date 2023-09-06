package tn.esprit.spring.controllers;

import java.io.Console;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.SupervisionWebApplication;
import tn.esprit.spring.Service.ProduitService;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.entities.Remplissage;

@RestController
@Log4j2
@CrossOrigin("*")

public class ProduitController {
	
	
	@Autowired
	
	private ProduitService produitService ; 
	
	
	@PostMapping("/addProduit")
	
	public Produit addReservoir(@RequestBody Produit p   ) {
		
		log.info(p);
			
		return produitService.addProduit(p);
	}

	@GetMapping("/AllProduit")
	@ResponseBody
	public List<Produit> GetAllProduits() {
		return produitService.GetAllProduit();
	}


	@DeleteMapping("/deleteProduit/{idprod}")
	public void deleteProduit(@PathVariable("idprod") Long id) {
		produitService.deleteProduit(id);
	}


	@PutMapping("/produpdate/{id}")
	public Produit updateRemplissage(@PathVariable Long id, @RequestBody Produit updated) {
		return produitService.UpdateProduit(id,updated);
	}








}



