package agence.client.proxy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import agence.rest.models.AdresseModel;
import agence.rest.models.ChambreModel;
import agence.rest.models.HotelModel;
import agence.rest.request.ReservationRequest;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

@Entity
@DiscriminatorValue("Rest")
public class RestProxy extends AProxy {

	
	@Transient
	private RestTemplate restTemplate;
	
	private String url;	
	
	
	public RestProxy() {
		super();
		RestTemplate restTemplate = new RestTemplate(); 
		this.restTemplate = restTemplate; 
	}

	public RestProxy(String url) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		this.url = url;
		this.restTemplate = restTemplate;
	}

	
	public List<ChambreModel> getAllChambre () {
		//URI uri = new URI(this.url);
		
		//return (List<Object>) this.restTemplate.getForObject(uri+"/chambre", Chambre.class);
        return this.restTemplate.exchange(this.url+"/chambre", HttpMethod.GET, null, new ParameterizedTypeReference<List<ChambreModel>>() {}).getBody();
		
	}

	@Override
	public HotelModel getHotel() {
		// TODO Auto-generated method stub
        return this.restTemplate.getForObject(this.url+"/hotel", HotelModel.class);
	}

	@Override
	public String setReservation(ReservationRequest requete) {
		// TODO Auto-generated method stub
		
		return this.restTemplate.postForObject(this.url+"/reservation", requete, String.class);
	}

	@Override
	public String afficherHotel() {
		// TODO Auto-generated method stub
		return this.restTemplate.getForObject(this.url+"/nameHotel", String.class);
	}

	@Override
	public AdresseModel adresseHotel() {
		// TODO Auto-generated method stub
		return this.restTemplate.getForObject(this.url+"/adress", AdresseModel.class);
	}

	@Override
	public List listeTypeChambre() {
		// TODO Auto-generated method stub
        return this.restTemplate.exchange(url+"/chambre/type", HttpMethod.GET, null, new ParameterizedTypeReference<List<Enum>>() {}).getBody();
	}
	
}