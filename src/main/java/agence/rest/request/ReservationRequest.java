package agence.rest.request;

import java.time.LocalDate;

import agence.rest.common.MDMethod;


public class ReservationRequest {

	private String dateEntree;
	private String dateSortie;
	private String typeDeChambre;
	
	
	
	
	// STRING
	public String getDateEntreeStr() {
		return dateEntree;
	}
	public void setDateEntree(String dateEntree) {
		this.dateEntree = dateEntree;
	}
	public String getDateSortieStr() {
		return dateSortie;
	}
	
	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}
	public String getTypeDeChambreStr() {
		return typeDeChambre;
	}
	public void setTypeDeChambre(String typeDeChambre) {
		this.typeDeChambre = typeDeChambre;
	}
	
	
	//OBJET CASTER 
	public LocalDate getDateEntree() {
		return MDMethod.strToDat(dateEntree);
	}

	public LocalDate getDateSortie() {
		return MDMethod.strToDat(dateSortie);
	}
	
	
}