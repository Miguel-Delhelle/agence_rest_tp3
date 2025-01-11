
package agence.gateway.soap.jaxws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chambre complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chambre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="disponibilite"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="key" type="{http://web.service.hotel/}localDate" minOccurs="0"/&gt;
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hotel" type="{http://web.service.hotel/}hotel" minOccurs="0"/&gt;
 *         &lt;element name="nombreLit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numeroChambre" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="reservation" type="{http://web.service.hotel/}reservation" minOccurs="0"/&gt;
 *         &lt;element name="typeChambre" type="{http://web.service.hotel/}typeChambre" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chambre", propOrder = {
    "disponibilite",
    "hotel",
    "nombreLit",
    "numeroChambre",
    "prix",
    "reservation",
    "typeChambre"
})
public class Chambre {

    @XmlElement(required = true)
    protected Chambre.Disponibilite disponibilite;
    protected Hotel hotel;
    protected int nombreLit;
    protected int numeroChambre;
    protected double prix;
    protected Reservation reservation;
    @XmlSchemaType(name = "string")
    protected TypeChambre typeChambre;

    /**
     * Gets the value of the disponibilite property.
     * 
     * @return
     *     possible object is
     *     {@link Chambre.Disponibilite }
     *     
     */
    public Chambre.Disponibilite getDisponibilite() {
        return disponibilite;
    }

    /**
     * Sets the value of the disponibilite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chambre.Disponibilite }
     *     
     */
    public void setDisponibilite(Chambre.Disponibilite value) {
        this.disponibilite = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the nombreLit property.
     * 
     */
    public int getNombreLit() {
        return nombreLit;
    }

    /**
     * Sets the value of the nombreLit property.
     * 
     */
    public void setNombreLit(int value) {
        this.nombreLit = value;
    }

    /**
     * Gets the value of the numeroChambre property.
     * 
     */
    public int getNumeroChambre() {
        return numeroChambre;
    }

    /**
     * Sets the value of the numeroChambre property.
     * 
     */
    public void setNumeroChambre(int value) {
        this.numeroChambre = value;
    }

    /**
     * Gets the value of the prix property.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Sets the value of the prix property.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link Reservation }
     *     
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation }
     *     
     */
    public void setReservation(Reservation value) {
        this.reservation = value;
    }

    /**
     * Gets the value of the typeChambre property.
     * 
     * @return
     *     possible object is
     *     {@link TypeChambre }
     *     
     */
    public TypeChambre getTypeChambre() {
        return typeChambre;
    }

    /**
     * Sets the value of the typeChambre property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeChambre }
     *     
     */
    public void setTypeChambre(TypeChambre value) {
        this.typeChambre = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="key" type="{http://web.service.hotel/}localDate" minOccurs="0"/&gt;
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class Disponibilite {

        protected List<Chambre.Disponibilite.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Chambre.Disponibilite.Entry }
         * 
         * 
         */
        public List<Chambre.Disponibilite.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<Chambre.Disponibilite.Entry>();
            }
            return this.entry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="key" type="{http://web.service.hotel/}localDate" minOccurs="0"/&gt;
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class Entry {

            protected LocalDate key;
            protected String value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link LocalDate }
             *     
             */
            public LocalDate getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocalDate }
             *     
             */
            public void setKey(LocalDate value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
