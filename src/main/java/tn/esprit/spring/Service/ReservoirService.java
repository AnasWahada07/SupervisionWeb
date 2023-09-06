package tn.esprit.spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.extern.log4j.Log4j2;
import tn.esprit.spring.Repository.ProduitRepository;
import tn.esprit.spring.Repository.ReservoirRepository;
import tn.esprit.spring.Repository.StationRepository;
import tn.esprit.spring.entities.Produit;
import tn.esprit.spring.entities.Reservoir;
import tn.esprit.spring.entities.Station;

import java.util.List;

@Service
@Log4j2
public class ReservoirService {
	
	@Autowired
    private ReservoirRepository reservoirRepository ; 
	
	@Autowired
	private StationRepository  stationRepository ; 
	
	@Autowired
	private ProduitRepository produitRepository ; 

    public Reservoir addReservoir(String min  , String max , String niveau ,
    		Long stationId , Long id 
    		) {
    	
   	Station station = stationRepository.getById(stationId);
   	Produit produit = produitRepository.getById(id);
   	 Reservoir reservoir = new Reservoir();
   	
   	log.info(produit);
    	    	
    reservoir.setStations(station);
    reservoir.setProduits(produit);
    reservoir.setMin(min);
    reservoir.setMax(max);
    reservoir.setNiveau(niveau);
        
    return reservoirRepository.save(reservoir);
        
         
    }

	public List<Reservoir> getAllResevoir() {

		return  (List<Reservoir>) reservoirRepository.findAll();

	}


	public Reservoir UpdateReservoir(Long id, Reservoir reservoirup) {
		reservoirup.setId(id);
		return reservoirRepository.save(reservoirup);
	}

	public void deleteReservoir(Long id) {

		Reservoir res =  reservoirRepository.findById(id).orElse(null);

		reservoirRepository.delete(res);
	}




}


