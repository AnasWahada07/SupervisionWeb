package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Station;


@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
	
	
}