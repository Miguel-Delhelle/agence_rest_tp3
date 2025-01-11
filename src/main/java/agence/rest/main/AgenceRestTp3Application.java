package agence.rest.main;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import agence.entity.models.Chambre;
import agence.gateway.rest.RestProxy;
import agence.gateway.soap.SoapProxy;

@SpringBootApplication
public class AgenceRestTp3Application {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException {
		SpringApplication.run(AgenceRestTp3Application.class, args);
		
		/*RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/Hotel/chambre";
		String reponse = restTemplate.getForObject(url, String.class);
		
		System.out.println("Réponse:" + reponse); */
		
		SoapProxy hotelSoap = new SoapProxy("http://localhost:8888/hotel?wsdl");
		RestProxy hotel1 = new RestProxy("http://localhost:8080/Hotel");
		List<Chambre> listechambre = hotel1.getListeChambre();
		System.out.println(listechambre.toString());
		System.out.println(listechambre.get(0).getNumeroChambre());
		System.out.println(listechambre.get(0).getPrix());
		
		System.out.println(hotelSoap.getHotelProxy().afficherNomHotel());
		System.out.println(hotelSoap.getHotelProxy().listeTypeChambre());

	}

}
