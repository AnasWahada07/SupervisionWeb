package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Remplissage;


@Repository
public interface RemplissageRepository extends JpaRepository<Remplissage, Long> {

}
