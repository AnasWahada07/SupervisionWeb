package tn.esprit.spring.controllers;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.Service.StationService;
import tn.esprit.spring.entities.Station;
import tn.esprit.spring.entities.Ville;

@RestController
@CrossOrigin("*")

public class StationController {


	@Autowired
	private StationService stationService;


	@PostMapping("/addstation")
	public Station AddStation(@RequestBody Station s, @RequestParam String nomville) {
		return stationService.addStation(s, nomville);

	}

	@GetMapping("/AllStation")
	@ResponseBody
	public List<Station> GetAllStation() {
		return stationService.getAllStations();
	}


	@DeleteMapping("/deleteStation/{idstation}")
	public void deleteVille(@PathVariable("idstation") Long id) {
		stationService.deleteStation(id);
	}


	@PutMapping("/stationupdate/{id}")
	public Station updatePerson(@PathVariable Long id, @RequestBody Station updated) {
		return stationService.UpdateStation(id, updated);
	}
}




	
	


