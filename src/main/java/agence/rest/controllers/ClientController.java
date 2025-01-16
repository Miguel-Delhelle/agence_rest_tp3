package agence.rest.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import agence.client.proxy.AProxy;
import agence.rest.models.HotelModel;
import agence.rest.repositories.ProxyRepository;
import agence.rest.request.ReservationRequest;

//@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/Agency")
public class ClientController {

	@Autowired
	private ProxyRepository proxyRepository;

	@GetMapping("/AllHotel")
	public ResponseEntity <List<HotelModel>> getAllHotel(){
		
		List <AProxy> listeToutProxy = proxyRepository.findAll();
		List <HotelModel> listeAllHotel = new ArrayList<HotelModel>();
		for (AProxy proxy : listeToutProxy) {
			listeAllHotel.add(proxy.getHotel());
		}
		return ResponseEntity.ok(listeAllHotel);
	}
	
	@PostMapping("/{id}/setReservation")
	public ResponseEntity<String> setReservation(@PathVariable("id") long id, @RequestBody ReservationRequest requête){
		
		Optional<AProxy> proxy = this.proxyRepository.findById(id);
		proxy.get().setReservation(requête);
		try {
			System.out.println(new ObjectMapper().writeValueAsString(requête));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ResponseEntity.ok("Réservation confirmé");
	}
	
	/*public HotelModel getHotel();
	
	public String setReservation( ReservationRequest requete);
	
	public String afficherHotel();
	
	public AdresseModel adresseHotel();
	
	public List listeTypeChambre(); */

}
