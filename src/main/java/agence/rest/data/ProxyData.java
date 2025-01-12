package agence.rest.data;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import agence.client.proxy.AProxy;
import agence.client.proxy.RestProxy;
import agence.client.proxy.SoapProxy;
import agence.rest.repositories.ProxyRepository;

@Configuration
public class ProxyData {

	private org.slf4j.Logger logger = LoggerFactory.getLogger(ProxyData.class);
	
	@Bean
	public CommandLineRunner initDatabaseHotel(ProxyRepository repository) {
		return args -> {
			AProxy leParisien = new RestProxy("http://localhost:8080/Hotel");
			//AProxy laComedie = new SoapProxy("http://localhost:8888/hotel?wsdl");
			
			logger.info("Préchargement de la base de donnée avec"+ repository.save(leParisien));//+"et"+repository.save(leParisien));
		};
	}
	
}
