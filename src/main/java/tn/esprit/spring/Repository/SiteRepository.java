package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Site;


@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {

}
