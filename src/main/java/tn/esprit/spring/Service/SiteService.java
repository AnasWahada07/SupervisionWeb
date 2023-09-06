package tn.esprit.spring.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.Repository.ProduitRepository;
import tn.esprit.spring.Repository.SiteRepository;
import tn.esprit.spring.Repository.StationRepository;
import tn.esprit.spring.Repository.VilleRepository;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.entities.Site;
import tn.esprit.spring.entities.Station;
import tn.esprit.spring.entities.Ville;

@Service
public class SiteService {
	
	@Autowired
    private  SiteRepository siteRepository ; 
	@Autowired
    private  VilleRepository villeRepository ; 
	@Autowired
    private  ProduitRepository produitRepository ; 

	
	
	public Site addSite(Site s , Long idville , Long idprod) {
		
		Ville v = villeRepository.getById(idville);
		Produit pro = produitRepository.getById(idprod);
		
         s.setVilles(v);
         s.setProduits(pro);
		
		
	      return  siteRepository.save(s);

		
	}
	
	public List<Site> GetAllSite() {
		
		return  (List<Site>) siteRepository.findAll();

	}

	public Site UpdateSite(Long id, Site sitemod) {
		sitemod.setId(id);
		return siteRepository.save(sitemod);
	}

	public void deleteSite(Long id) {

		Site s =  siteRepository.findById(id).orElse(null);

		siteRepository.delete(s);
	}








}
