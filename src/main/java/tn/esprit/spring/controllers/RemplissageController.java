package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.Service.RemplissageService;
import tn.esprit.spring.entities.Remplissage;
import tn.esprit.spring.entities.Reservoir;

import java.util.List;

@RestController
@CrossOrigin("*")

public class RemplissageController {
	
	@Autowired
	
	private RemplissageService remplissageService ; 
	
    @PostMapping("/addremp")
   public Remplissage addRemplissage(@RequestBody Remplissage r , @RequestParam Long idsite
		   , @RequestParam Long idprod , @RequestParam Long idville  ) {
   
	return    remplissageService.addRemplissage(r, idprod, idsite ,idville);

    }

	@GetMapping("/AllRemplissage")
	@ResponseBody
	public List<Remplissage> GetAllRemplissages() {
		return remplissageService.getAllRemplissage();
	}


	@DeleteMapping("/deleteRemplis/{idrempli}")
	public void deleteRemplissge(@PathVariable("idrempli") Long id) {
		remplissageService.deleteRemplissage(id);
	}


	@PutMapping("/remplissageupdate/{id}")
	public Remplissage updateRemplissage(@PathVariable Long id, @RequestBody Remplissage updated) {
		return remplissageService.UpdateRemplissage(id,updated);
	}






}
