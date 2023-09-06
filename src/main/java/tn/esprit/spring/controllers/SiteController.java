package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.extern.log4j.Log4j2;
import tn.esprit.spring.SupervisionWebApplication;
import tn.esprit.spring.Service.SiteService;
import tn.esprit.spring.Service.VilleService;
import tn.esprit.spring.entities.Site;
import tn.esprit.spring.entities.Station;
import tn.esprit.spring.entities.Ville;

@RestController
@Log4j2
@CrossOrigin("*")

public class SiteController {
	
	
	@Autowired
	   private SiteService siteService ; 
		
		
	    @PostMapping("/addsite")
	   public Site AddSite(@RequestBody Site site , @RequestParam Long idville
			   , @RequestParam Long idproduit  ) {

	    
   	return    siteService.addSite(site, idville, idproduit);
	        
	    }

		@GetMapping("/AllSite")
		@ResponseBody
		public List<Site> GetAllSite(){
			return siteService.GetAllSite();
		}

	@DeleteMapping("/deleteSite/{idsite}")
	public void deleteVille(@PathVariable("idsite") Long id) {
		siteService.deleteSite(id);
	}


	@PutMapping("/Siteupdate/{id}")
	public Site updatePerson(@PathVariable Long id, @RequestBody Site updated) {
		return siteService.UpdateSite(id,updated);
	}


	
	
	
	

}
