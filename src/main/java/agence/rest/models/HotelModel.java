package agence.rest.models;

import java.util.List;

public class HotelModel {

	private String nom;
	private AdresseModel  adresse;
    private int nombreEtoile;
    private List<ChambreModel> listeChambre;
    
    
    
	public HotelModel() {
		super();
	}
	
	
	
	public HotelModel(String nom, AdresseModel adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}



	public HotelModel(String nom, AdresseModel adresse, List<ChambreModel> listeChambre) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.listeChambre = listeChambre;
	}


	public HotelModel(String nom) {
		super();
		this.nom = nom;
	}
	public HotelModel(String nom, AdresseModel adresse, int nombreEtoile, List<ChambreModel> listeChambre) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.nombreEtoile = nombreEtoile;
		this.listeChambre = listeChambre;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public AdresseModel getAdresse() {
		return adresse;
	}
	public void setAdresse(AdresseModel adresse) {
		this.adresse = adresse;
	}
	public int getNombreEtoile() {
		return nombreEtoile;
	}
	public void setNombreEtoile(int nombreEtoile) {
		this.nombreEtoile = nombreEtoile;
	}
	public List<ChambreModel> getListeChambre() {
		return listeChambre;
	}
	public void setListeChambre(List<ChambreModel> listeChambre) {
		this.listeChambre = listeChambre;
	}
	@Override
	public String toString() {
		return "HotelModel [nom=" + nom + ", adresse=" + adresse + ", nombreEtoile=" + nombreEtoile + ", listeChambre="
				+ listeChambre + "]";
	}
    
    
}
