package agence.rest.controllers;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import agence.client.proxy.AProxy;
import agence.client.proxy.RestProxy;
import agence.client.proxy.SoapProxy;
import agence.rest.repositories.ProxyRepository;
import agence.rest.request.AddHotelRequest;

@RestController
@RequestMapping("/Admin")
public class AdminController {

	@Autowired
	private ProxyRepository proxyRepository;
	
	@PostMapping("/addHotel")
	public ResponseEntity<String> addWS(@RequestBody AddHotelRequest requete){
		
		if (requete.getUrl().endsWith("?wsdl")) {
			try {
				AProxy nouveauProxy = new SoapProxy(requete.getUrl());
				proxyRepository.save(nouveauProxy);
			} catch (MalformedURLException | URISyntaxException e) {
				// TODO Auto-generated catch block
		        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("URI NON VALIDE");
			}}
		else {
				AProxy nouveauProxy = new RestProxy(requete.getUrl()); {
				proxyRepository.save(nouveauProxy);
			}
		}
		
		
		return ResponseEntity.ok("Ajout réussi");
	}
}
