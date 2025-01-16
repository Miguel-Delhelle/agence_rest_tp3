package agence.rest.main;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MissingRequiredPropertiesException;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.Profiles;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"agence.client.proxy"})

@EnableJpaRepositories(basePackages = {"agence.rest.repositories"})

@SpringBootApplication(scanBasePackages = {
"agence.rest.data",
"agence.rest.controllers",
})
public class AgenceRestTp3Application {
	
    
    
	public static void main(String[] args) throws URISyntaxException, MalformedURLException {
		
		SpringApplication.run(AgenceRestTp3Application.class, args);
		

		System.out.println("Serveur prêt");

	}

}
