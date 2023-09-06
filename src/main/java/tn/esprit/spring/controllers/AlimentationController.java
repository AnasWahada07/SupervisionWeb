package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import tn.esprit.spring.Service.AlimentationService;
import tn.esprit.spring.entities.Alimentation;

@RestController
@CrossOrigin("*")

public class AlimentationController {
	
	@Autowired
	
	private AlimentationService alimentationService ; 
	
	@PostMapping("/addalime")
	public Alimentation addAlimentation(@RequestBody Alimentation z , @RequestParam Long idprod ,
			@RequestParam Long idsite , @RequestParam Long idville , @RequestParam Long idreserv) {
		
		
		return alimentationService.addAlimentation(z, idprod, idsite, idville, idreserv);
		
		
	}

}
