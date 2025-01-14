package agence.client.proxy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import agence.rest.models.AdresseModel;
import agence.rest.models.ChambreModel;
import agence.rest.models.HotelModel;
import agence.rest.request.ReservationRequest;
import agence.soap.apacheimport.Chambre;
import agence.soap.apacheimport.ChambreNonDisponibleException_Exception;
import agence.soap.apacheimport.IHotelService;
import agence.soap.apacheimport.ReservationFailedException_Exception;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;


@Entity
@DiscriminatorValue("Soap")
public class SoapProxy extends AProxy {
	

	private String url = "http://localhost:8888/hotel?wsdl";
	
	@Transient
	private IHotelService hotelProxy;
	
	
	
	public SoapProxy() {
		super();
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IHotelService.class);
        factory.setAddress(url);
		this.hotelProxy = (IHotelService) factory.create();
	}

	public SoapProxy(String uriInit) throws URISyntaxException, MalformedURLException {
		//URI uri = new URI(uriInit); // On initialise toujours avec cette ip le premier proxy
		this.url = uriInit;
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IHotelService.class); // L'interface générée par CXF
        factory.setAddress(uriInit);  // L'URL de ton service SOAP
        
        // Récupérer le proxy
        this.hotelProxy = (IHotelService) factory.create();
		
	}

	public String getUrl() {
		return url;
	}

	public IHotelService getHotelProxy() {
		return hotelProxy;
	}

	@Override
	public List<ChambreModel> getAllChambre(){
		
		/*LocalDate mtn = LocalDate.now();
		String mtnStr = mtn.toString();
		LocalDate oneYearLater = mtn.plusYears(1);
		String oneYearLaterStr = oneYearLater.toString(); 
		List<Chambre> listeChambreSoap = hotelProxy.listeChambreDisponible(mtnStr, oneYearLaterStr); */
		
		//JAXBContext context = JAXBContext.newInstance(Chambre.class);
		//Unmarshaller unmarshaller = context.createUnmarshaller();
		List<ChambreModel> listeChambreRest = new ArrayList<ChambreModel>();
		List<Chambre> listeChambreSoap = this.hotelProxy.getListeChambre();
		
		
		for (Chambre chbrSoap : listeChambreSoap) {
			ChambreModel chambreRestTmp = castChambreSoapToRest(chbrSoap);
			listeChambreRest.add(chambreRestTmp);
		}
		
		return listeChambreRest;
	} 

	@Override
	public HotelModel getHotel() {
		HotelModel hotelRest = new HotelModel();
		hotelRest.setNom(this.hotelProxy.afficherNomHotel());;
		hotelRest.setListeChambre(this.getAllChambre());
		hotelRest.setAdresse(this.adresseHotel());
		
		return hotelRest;
	}

	@Override
	public String afficherHotel() {
		// TODO Auto-generated method stub
		return this.hotelProxy.afficherHotel();
	}

	@Override
	public AdresseModel adresseHotel() {
		AdresseModel adresseRest = new AdresseModel();
		adresseRest.setCodePostal(Integer.parseInt(this.hotelProxy.getAdresse().getCodePostal()));
		adresseRest.setNumero(Integer.parseInt(this.hotelProxy.getAdresse().getNumero()));
		adresseRest.setPays(this.hotelProxy.getAdresse().getPays());
		adresseRest.setRue(this.hotelProxy.getAdresse().getRue());
		adresseRest.setVille(this.hotelProxy.getAdresse().getVille());
		
		
		return adresseRest;
	}

	@Override
	public String setReservation(ReservationRequest requete) {
		// TODO Auto-generated method stub
		try {
			this.getHotelProxy().setReservationWM(requete.getDateEntreeStr(),requete.getDateSortieStr(),requete.getTypeDeChambreStr());
		} catch (ReservationFailedException_Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		} catch (ChambreNonDisponibleException_Exception e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
		return ("Réservation confirmé au"+this.getHotelProxy().afficherNomHotel());
	}

	@Override
	public List listeTypeChambre() {
		
		return this.hotelProxy.listeTypeChambre();
		
	}
	
	public static ChambreModel castChambreSoapToRest(Chambre chambreSoap) {
		ChambreModel chambreRest = new ChambreModel(); 
		chambreRest.setPrix(chambreSoap.getPrix());
		chambreRest.setTypeChambre(chambreSoap.getTypeChambre().toString());
		chambreRest.setNumeroChambre(chambreSoap.getNumeroChambre());
		chambreRest.setNombreLit(chambreSoap.getNombreLit());
		chambreRest.addReservation(chambreSoap.getReservation());
		
		
		return chambreRest;
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
