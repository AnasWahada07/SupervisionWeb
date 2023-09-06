package tn.esprit.spring.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Repository.VilleRepository;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.entities.Ville;

@Service
public class VilleService {
	
	@Autowired
    private  VilleRepository villeRepository ; 
	

	public Ville addVille(Ville v) {
		
	      return  villeRepository.save(v);
		
	}

	public Ville GetVilleById(Long id) {

		return villeRepository.findById(id).orElse(null);



	}


	public List<Ville> GetAllVille() {
		
		return  (List<Ville>) villeRepository.findAll();

	}

	public Ville UpdateVille(Long id, Ville villemod) {
		villemod.setId(id);
		return villeRepository.save(villemod);
	}

	public void deleteVille(Long id) {

		Ville v =  villeRepository.findById(id).orElse(null);

		villeRepository.delete(v);
	}





}
