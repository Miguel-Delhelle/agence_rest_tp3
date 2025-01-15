package agence.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import agence.client.proxy.AProxy;
import agence.rest.models.HotelModel;
import agence.rest.repositories.ProxyRepository;

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
	
	/*public HotelModel getHotel();
	
	public String setReservation( ReservationRequest requete);
	
	public String afficherHotel();
	
	public AdresseModel adresseHotel();
	
	public List listeTypeChambre(); */

}
