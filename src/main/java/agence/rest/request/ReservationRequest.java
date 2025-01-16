package agence.rest.request;

import java.time.LocalDate;

import agence.rest.common.MDMethod;


public class ReservationRequest {

	private String dateEntree;
	private String dateSortie;
	private String typeDeChambre;
	
	
	
	
	// STRING
	public String getDateEntree() {
		return dateEntree;
	}
	public void setDateEntree(String dateEntree) {
		this.dateEntree = dateEntree;
	}
	public String getDateSortie() {
		return dateSortie;
	}
	
	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}
	public String getTypeDeChambre() {
		return typeDeChambre;
	}
	public void setTypeDeChambre(String typeDeChambre) {
		this.typeDeChambre = typeDeChambre;
	}
	
	
	
	
}
