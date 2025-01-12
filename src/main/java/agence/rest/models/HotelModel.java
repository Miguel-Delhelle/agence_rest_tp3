package agence.rest.models;

import java.util.List;

public class HotelModel {

	private String nom;
	private AdresseModel  adresse;
    private int nombreEtoile;
    private List<ChambreModel> listeChambre;
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
