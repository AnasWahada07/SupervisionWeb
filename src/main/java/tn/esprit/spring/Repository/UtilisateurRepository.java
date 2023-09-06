package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Utilisateur;


@Repository 
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	
	
}