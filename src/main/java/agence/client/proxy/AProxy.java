package agence.client.proxy;

import java.util.List;

import agence.rest.models.AdresseModel;
import agence.rest.models.ChambreModel;
import agence.rest.models.HotelModel;
import agence.rest.request.ReservationRequest;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "type_de_proxy")
public abstract class AProxy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public abstract List<ChambreModel> getAllChambre();
	public abstract HotelModel getHotel();
	public abstract String setReservation( ReservationRequest requete);
	public abstract String afficherHotel();
	public abstract AdresseModel adresseHotel();
	public abstract List<?> listeTypeChambre();
	
	
}
