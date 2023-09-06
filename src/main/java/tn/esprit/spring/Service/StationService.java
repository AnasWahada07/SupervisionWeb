package tn.esprit.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repository.StationRepository;
import tn.esprit.spring.Repository.VilleRepository;
import tn.esprit.spring.entities.Station;
import tn.esprit.spring.entities.Ville;

@Service
public class StationService  {
	
	@Autowired
    private StationRepository stationRepository;
	
	@Autowired
	private VilleRepository villeRepository ; 

    public Station addStation(Station s , String nomVille ) {
    	
    	Ville ville = villeRepository.findByNom(nomVille);
    
    	s.setVilles(ville);
        
        return stationRepository.save(s);
    }

	public List<Station> getAllStations() {
		
		return  (List<Station>) stationRepository.findAll();

	}


	public Station UpdateStation(Long id, Station stationmod) {
		stationmod.setId(id);
		return stationRepository.save(stationmod);
	}

	public void deleteStation(Long id) {

		Station s =  stationRepository.findById(id).orElse(null);

		stationRepository.delete(s);
	}



}

	
		



