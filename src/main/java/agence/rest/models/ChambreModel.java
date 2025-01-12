package agence.rest.models;


import java.time.LocalDate;
import java.util.List;

public class ChambreModel {
	
    private int numeroChambre; 
	private int nombreLit;
    private double prix;
    private String typeChambre;
    private String hotel;
    private List<LocalDate> dateReservee;
    private List <Object> listReservation;
    
    
	public int getNumeroChambre() {
		return numeroChambre;
	}
	public void setNumeroChambre(int numeroChambre) {
		this.numeroChambre = numeroChambre;
	}
	public int getNombreLit() {
		return nombreLit;
	}
	public void setNombreLit(int nombreLit) {
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
	
	public List<Object> getReservation() {
		return listReservation;
	}
	public void setReservation(List<Object> reservation) {
		this.listReservation = reservation;
	}
	public void addReservation(Object reservation) {
		this.listReservation.add(reservation);
	}
	
	@Override
	public String toString() {
		return "Chambre [numeroChambre=" + numeroChambre + ", nombreLit=" + nombreLit + ", prix=" + prix
				+ ", typeChambre=" + typeChambre + ", hotel=" + hotel + ", dateReservee=" + dateReservee + "]";
	}
    
    
	
    
}
