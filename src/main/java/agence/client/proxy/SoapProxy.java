package agence.client.proxy;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import agence.rest.models.AdresseModel;
import agence.rest.models.ChambreModel;
import agence.rest.models.HotelModel;
import agence.soap.apacheimport.IHotelService;



@Component
public class SoapProxy implements IProxy {
	
	private URI url;
	IHotelService hotelProxy;
	
	public SoapProxy(String uriInit) throws URISyntaxException, MalformedURLException {
		URI uri = new URI(uriInit); // On initialise toujours avec cette ip le premier proxy
		this.url = uri;
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IHotelService.class); // L'interface générée par CXF
        factory.setAddress(uriInit);  // L'URL de ton service SOAP
        
        // Récupérer le proxy
        this.hotelProxy = (IHotelService) factory.create();
		
	}

	public URI getUrl() {
		return url;
	}

	public IHotelService getHotelProxy() {
		return hotelProxy;
	}

	@Override
	public List<ChambreModel> getAllChambre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelModel getHotel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setReservation(String dateEntree, String dateSortie, String typeDeChambre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String afficherHotel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdresseModel adresseHotel() {
		// TODO Auto-generated method stub
		return null;
	}

	 

	/*public void initListProxy() throws MalformedURLException {
		URL url = new URL("http://localhost:8888/hotel"); // On initialise toujours avec cette ip le premier proxy
		HotelService serviceTmp = new HotelService(url);
		IHotelService proxy = serviceTmp.getHotelPort();
		this.getListeProxy().add(proxy);
	} */
	
	/*@SuppressWarnings("deprecation")
	public void addProxy(String strUrlNewProxy) throws MalformedURLException{
		URL urlNewProxy = new URL(strUrlNewProxy);
		HotelService serviceTmp = new HotelService(urlNewProxy);
		IHotelService proxyNewHotel = serviceTmp.getHotelPort();
		this.getListeProxy().add(proxyNewHotel);
	} 
	
	public IHotelService getHotelByName(String str) {
		for (IHotelService proxy: this.getListeProxy()) {
			if (str.equals(proxy.afficherNomHotel())) {
				return proxy;
			}
		}
		return null;
	} */
	
}
