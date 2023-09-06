package tn.esprit.spring.controllers;

import java.io.Console;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.log4j.Log4j2;
import tn.esprit.spring.Service.ReservoirService;
import tn.esprit.spring.entities.Reservoir;
import tn.esprit.spring.entities.Station;

@RestController
@Log4j2
@CrossOrigin("*")

public class ReservoirController {
	
	
	@Autowired
	private ReservoirService reservoirService ;
	
	@PostMapping("/addreservoir/{stationid}/{id}")
	
	public Reservoir addReservoir(@RequestBody Reservoir reservoir
			,  @PathVariable("stationid") Long stationid
			, @PathVariable("id") Long id  ) {
		
		
		
	 return reservoirService.addReservoir( reservoir.getMin(), reservoir.getMax() , reservoir.getNiveau() ,  stationid, id);

		
	}

	@GetMapping("/AllResevoir")
	@ResponseBody
	public List<Reservoir> GetAllReservoirs() {
		return reservoirService.getAllResevoir();
	}


	@DeleteMapping("/deleteReservoir/{idreservoir}")
	public void deleteReservoir(@PathVariable("idreservoir") Long id) {
		reservoirService.deleteReservoir(id);
	}


	@PutMapping("/reservoirupdate/{id}")
	public Reservoir updatePerson(@PathVariable Long id, @RequestBody Reservoir updated) {
		return reservoirService.UpdateReservoir(id,updated);
	}
	
}
	
	
	
	
	


