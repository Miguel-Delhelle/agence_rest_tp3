package agence.gateway.soap.proxy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import agence.gateway.soap.jaxws.HotelService;
import agence.gateway.soap.jaxws.IHotelService;




public class ProxySoap {
		
	/*public ProxySoap() {
		try {
			initListProxy();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} */


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
