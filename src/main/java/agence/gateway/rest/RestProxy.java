package agence.gateway.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import agence.entity.models.Chambre;


@Component
public class RestProxy {

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
	
	public List<Chambre> getListeChambre () throws URISyntaxException {
		//URI uri = new URI(this.url);
		
		//return (List<Object>) this.restTemplate.getForObject(uri+"/chambre", Chambre.class);
        return this.restTemplate.exchange(url+"/chambre", HttpMethod.GET, null, new ParameterizedTypeReference<List<Chambre>>() {}).getBody();
		
	}
	
}