
package agence.soap.apacheimport;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chambreReservee" type="{http://web.service.hotel/}chambre" minOccurs="0"/&gt;
 *         &lt;element name="client" type="{http://web.service.hotel/}personne" minOccurs="0"/&gt;
 *         &lt;element name="dateEntree" type="{http://web.service.hotel/}localDate" minOccurs="0"/&gt;
 *         &lt;element name="dateReservee" type="{http://web.service.hotel/}localDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dateSortie" type="{http://web.service.hotel/}localDate" minOccurs="0"/&gt;
 *         &lt;element name="hotelReservee" type="{http://web.service.hotel/}hotel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "chambreReservee",
    "client",
    "dateEntree",
    "dateReservee",
    "dateSortie",
    "hotelReservee"
})
public class Reservation {

    protected Chambre chambreReservee;
    protected Personne client;
    protected LocalDate dateEntree;
    @XmlElement(nillable = true)
    protected List<LocalDate> dateReservee;
    protected LocalDate dateSortie;
    protected Hotel hotelReservee;

    /**
     * Obtient la valeur de la propriété chambreReservee.
     * 
     * @return
     *     possible object is
     *     {@link Chambre }
     *     
     */
    public Chambre getChambreReservee() {
        return chambreReservee;
    }

    /**
     * Définit la valeur de la propriété chambreReservee.
     * 
     * @param value
     *     allowed object is
     *     {@link Chambre }
     *     
     */
    public void setChambreReservee(Chambre value) {
        this.chambreReservee = value;
    }

    /**
     * Obtient la valeur de la propriété client.
     * 
     * @return
     *     possible object is
     *     {@link Personne }
     *     
     */
    public Personne getClient() {
        return client;
    }

    /**
     * Définit la valeur de la propriété client.
     * 
     * @param value
     *     allowed object is
     *     {@link Personne }
     *     
     */
    public void setClient(Personne value) {
        this.client = value;
    }

    /**
     * Obtient la valeur de la propriété dateEntree.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getDateEntree() {
        return dateEntree;
    }

    /**
     * Définit la valeur de la propriété dateEntree.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setDateEntree(LocalDate value) {
        this.dateEntree = value;
    }

    /**
     * Gets the value of the dateReservee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dateReservee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateReservee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalDate }
     * 
     * 
     */
    public List<LocalDate> getDateReservee() {
        if (dateReservee == null) {
            dateReservee = new ArrayList<LocalDate>();
        }
        return this.dateReservee;
    }

    /**
     * Obtient la valeur de la propriété dateSortie.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getDateSortie() {
        return dateSortie;
    }

    /**
     * Définit la valeur de la propriété dateSortie.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setDateSortie(LocalDate value) {
        this.dateSortie = value;
    }

    /**
     * Obtient la valeur de la propriété hotelReservee.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotelReservee() {
        return hotelReservee;
    }

    /**
     * Définit la valeur de la propriété hotelReservee.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotelReservee(Hotel value) {
        this.hotelReservee = value;
    }

}
