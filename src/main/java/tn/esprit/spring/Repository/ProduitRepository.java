package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Produit;

@Repository
public interface ProduitRepository  extends JpaRepository<Produit, Long> { 
	
	 Produit findByNom(String nom);
	
	
	
	
}


