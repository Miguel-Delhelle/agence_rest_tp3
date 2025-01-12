package agence.rest.models;


import java.time.LocalDate;
import java.util.List;

public class ChambreModel {
	
    private int numeroChambre; 
	private String nombreLit;
    private double prix;
    private String typeChambre;
    private String hotel;
    private List<LocalDate> dateReservee;
    //private List <Reservation>;
	public int getNumeroChambre() {
		return numeroChambre;
	}
	public void setNumeroChambre(int numeroChambre) {
		this.numeroChambre = numeroChambre;
	}
	public String getNombreLit() {
		return nombreLit;
	}
	public void setNombreLit(String nombreLit) {
		this.nombreLit = nombreLit;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getTypeChambre() {
		return typeChambre;
	}
	public void setTypeChambre(String typeChambre) {
		this.typeChambre = typeChambre;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public List<LocalDate> getDateReservee() {
		return dateReservee;
	}
	public void setDateReservee(List<LocalDate> dateReservee) {
		this.dateReservee = dateReservee;
	}
	@Override
	public String toString() {
		return "Chambre [numeroChambre=" + numeroChambre + ", nombreLit=" + nombreLit + ", prix=" + prix
				+ ", typeChambre=" + typeChambre + ", hotel=" + hotel + ", dateReservee=" + dateReservee + "]";
	}
    
    
	
    
}
