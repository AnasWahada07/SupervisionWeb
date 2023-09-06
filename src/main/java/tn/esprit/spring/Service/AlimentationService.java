package tn.esprit.spring.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Repository.AlimentationRepository;
import tn.esprit.spring.Repository.ProduitRepository;
import tn.esprit.spring.Repository.ReservoirRepository;
import tn.esprit.spring.Repository.SiteRepository;
import tn.esprit.spring.Repository.VilleRepository;
import tn.esprit.spring.entities.Alimentation;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.entities.Reservoir;
import tn.esprit.spring.entities.Site;
import tn.esprit.spring.entities.Ville;

@Service
public class AlimentationService {
	
	@Autowired
	
	private AlimentationRepository alimentationRepository ; 
	@Autowired
	
	private ProduitRepository produitRepository ; 
	
	@Autowired
	
	private SiteRepository siteRepository ; 
	
	@Autowired
	
	private VilleRepository villeRepository ; 
	@Autowired
	private ReservoirRepository reservoirRepository ; 
	
	
	public Alimentation addAlimentation(Alimentation a , Long idprod , Long idsite , Long idville ,
			Long idreserv) {
		
		Produit r = produitRepository.getById(idprod);
		Site s = siteRepository.getById(idsite);
		Ville v = villeRepository.getById(idville);
		Reservoir re = reservoirRepository.getById(idreserv);
		
		a.setProduits(r);
		a.setSites(s);
		a.setVilles(v);
		a.setReservoirs(re);
		a.setDate(new Date());
		
	return alimentationRepository.save(a);
		
		
	}

	
	
	
	
	
	
	

}
