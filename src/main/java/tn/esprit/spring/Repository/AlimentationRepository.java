package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Alimentation;

@Repository
public interface AlimentationRepository extends JpaRepository<Alimentation, Long> {

}
