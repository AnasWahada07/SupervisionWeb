package tn.esprit.spring.Service;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import tn.esprit.spring.Repository.ProduitRepository;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.entities.Site;

import java.util.List;


@Service
@Log4j2
public class ProduitService {
	
	@Autowired
	private ProduitRepository produitRepository ; 
	
	
		
	public Produit  addProduit( Produit p  ) {
		
	log.info(p);


	return produitRepository.save(p);
		
	
	}

	public List<Produit> GetAllProduit() {

		return  (List<Produit>) produitRepository.findAll();

	}

	public Produit UpdateProduit(Long id, Produit prod) {
		prod.setId(id);
		return produitRepository.save(prod);
	}

	public void deleteProduit(Long id) {

		Produit p =  produitRepository.findById(id).orElse(null);

		produitRepository.delete(p);
	}







}
	
	
