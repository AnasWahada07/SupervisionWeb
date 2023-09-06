package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Ville;

@Repository
public interface VilleRepository extends JpaRepository<Ville, Long> {
	
	Ville findByNom(String nom);
	
	
}