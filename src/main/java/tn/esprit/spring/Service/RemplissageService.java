package tn.esprit.spring.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Repository.ProduitRepository;
import tn.esprit.spring.Repository.RemplissageRepository;
import tn.esprit.spring.Repository.SiteRepository;
import tn.esprit.spring.Repository.VilleRepository;
import tn.esprit.spring.entities.*;

@Service
public class RemplissageService {
	
	@Autowired
	
	private RemplissageRepository remplissageRepository ; 
	
	@Autowired
	private ProduitRepository produitRepository ; 
	
	@Autowired
	private SiteRepository siteRepository ; 
	@Autowired
	
	private VilleRepository villeRepository ; 
	
	public Remplissage addRemplissage (Remplissage r , Long idprod , Long idsite , Long idville) {
		
		Produit pro = produitRepository.getById(idprod);
		Site s = siteRepository.getById(idsite);
		Ville v = villeRepository.getById(idville);	
		
		
		r.setProduits(pro);
		r.setSites(s);
		r.setVilles(v);
		
		r.setDate(new Date());
		
		return remplissageRepository.save(r);

	}

	public List<Remplissage> getAllRemplissage() {

		return  (List<Remplissage>) remplissageRepository.findAll();

	}


	public Remplissage UpdateRemplissage(Long id, Remplissage remp) {
		remp.setId(id);
		return remplissageRepository.save(remp);
	}

	public void deleteRemplissage(Long id) {

		Remplissage remps =  remplissageRepository.findById(id).orElse(null);

		remplissageRepository.delete(remps);
	}







}

