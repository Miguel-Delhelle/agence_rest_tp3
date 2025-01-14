package agence.rest.main;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import agence.client.proxy.RestProxy;
import agence.client.proxy.SoapProxy;
import agence.rest.models.ChambreModel;

@EntityScan(basePackages = {"agence.client.proxy"})

@EnableJpaRepositories(basePackages = {"agence.rest.repositories"})

@SpringBootApplication(scanBasePackages = {
"agence.rest.data",
"agence.rest.controllers",
})
public class AgenceRestTp3Application {
	
	public static void main(String[] args) throws URISyntaxException, MalformedURLException {
		SpringApplication.run(AgenceRestTp3Application.class, args);
		
		/*RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/Hotel/chambre";
		String reponse = restTemplate.getForObject(url, String.class);
		
		System.out.println("Réponse:" + reponse); */
		
		//SoapProxy hotelSoap = new SoapProxy("http://localhost:8888/hotel?wsdl");
		//RestProxy hotel1 = new RestProxy("http://localhost:8080/Hotel");
		//List<ChambreModel> listechambre = hotel1.getAllChambre();
		//System.out.println(hotelSoap.getHotel().toString());
		System.out.println("Serveur prêt");

	}

}
