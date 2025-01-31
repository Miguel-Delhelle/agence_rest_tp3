package agence.rest.models;

public class AdresseModel {

	private String pays;
	private String rue;
	private int numero;
    private int codePostal;
    private String ville;
    
    
    
	public AdresseModel() {
		super();
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Override
	public String toString() {
		return "AdresseModel [pays=" + pays + ", rue=" + rue + ", numero=" + numero + ", codePostal=" + codePostal
				+ ", ville=" + ville + "]";
	}
	
	
    
    
	
	
}
