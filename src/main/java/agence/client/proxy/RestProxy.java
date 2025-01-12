package agence.client.proxy;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import agence.rest.models.AdresseModel;
import agence.rest.models.ChambreModel;
import agence.rest.models.HotelModel;
import agence.rest.request.ReservationRequest;

@Configuration
@Component
public class RestProxy implements IProxy {

	private final RestTemplate restTemplate;
	private final String url;
	
	
	public RestProxy(String url) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		this.url = url;
		this.restTemplate = restTemplate;
	}

	@Bean
	public RestTemplate generateRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	public List<ChambreModel> getAllChambre () {
		//URI uri = new URI(this.url);
		
		//return (List<Object>) this.restTemplate.getForObject(uri+"/chambre", Chambre.class);
        return this.restTemplate.exchange(url+"/chambre", HttpMethod.GET, null, new ParameterizedTypeReference<List<ChambreModel>>() {}).getBody();
		
	}

	@Override
	public HotelModel getHotel() {
		// TODO Auto-generated method stub
        return this.restTemplate.getForObject(url+"/hotel", HotelModel.class);
	}

	@Override
	public ResponseEntity<String> setReservation(ReservationRequest requete) {
		// TODO Auto-generated method stub
		
		return this.restTemplate.postForEntity(this.url+"/reservation", requete, String.class);
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
	
}