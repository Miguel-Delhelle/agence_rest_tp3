package agence.gateway.soap;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import agence.gateway.soap.jaxws.HotelService;
import agence.gateway.soap.jaxws.IHotelService;




public class SoapProxy {
	
	private URI url;
	IHotelService hotelProxy;
	
	public SoapProxy(String uriInit) throws URISyntaxException, MalformedURLException {
		URI uri = new URI(uriInit); // On initialise toujours avec cette ip le premier proxy
		this.url = uri;
		HotelService serviceTmp = new HotelService(uri.toURL());
		IHotelService proxy = serviceTmp.getHotelPort();
		this.hotelProxy = proxy;
		
	}

	public URI getUrl() {
		return url;
	}

	public IHotelService getHotelProxy() {
		return hotelProxy;
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
