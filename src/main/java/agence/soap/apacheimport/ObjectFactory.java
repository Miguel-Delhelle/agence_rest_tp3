
package agence.soap.apacheimport;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the agence.soap.apacheimport package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ChambreNonDisponibleException_QNAME = new QName("http://web.service.hotel/", "ChambreNonDisponibleException");
    private final static QName _ReservationFailedException_QNAME = new QName("http://web.service.hotel/", "ReservationFailedException");
    private final static QName _AfficherHotel_QNAME = new QName("http://web.service.hotel/", "afficherHotel");
    private final static QName _AfficherHotelResponse_QNAME = new QName("http://web.service.hotel/", "afficherHotelResponse");
    private final static QName _AfficherNomHotel_QNAME = new QName("http://web.service.hotel/", "afficherNomHotel");
    private final static QName _AfficherNomHotelResponse_QNAME = new QName("http://web.service.hotel/", "afficherNomHotelResponse");
    private final static QName _GetAdresse_QNAME = new QName("http://web.service.hotel/", "getAdresse");
    private final static QName _GetAdresseResponse_QNAME = new QName("http://web.service.hotel/", "getAdresseResponse");
    private final static QName _GetListeChambre_QNAME = new QName("http://web.service.hotel/", "getListeChambre");
    private final static QName _GetListeChambreResponse_QNAME = new QName("http://web.service.hotel/", "getListeChambreResponse");
    private final static QName _ListeChambreDisponible_QNAME = new QName("http://web.service.hotel/", "listeChambreDisponible");
    private final static QName _ListeChambreDisponibleResponse_QNAME = new QName("http://web.service.hotel/", "listeChambreDisponibleResponse");
    private final static QName _ListeChambreDisponibleToString_QNAME = new QName("http://web.service.hotel/", "listeChambreDisponibleToString");
    private final static QName _ListeChambreDisponibleToStringResponse_QNAME = new QName("http://web.service.hotel/", "listeChambreDisponibleToStringResponse");
    private final static QName _ListeTypeChambre_QNAME = new QName("http://web.service.hotel/", "listeTypeChambre");
    private final static QName _ListeTypeChambreResponse_QNAME = new QName("http://web.service.hotel/", "listeTypeChambreResponse");
    private final static QName _SetReservationWM_QNAME = new QName("http://web.service.hotel/", "setReservationWM");
    private final static QName _SetReservationWMResponse_QNAME = new QName("http://web.service.hotel/", "setReservationWMResponse");
    private final static QName _SetReservationWMAuth_QNAME = new QName("http://web.service.hotel/", "setReservationWM_Auth");
    private final static QName _SetReservationWMAuthResponse_QNAME = new QName("http://web.service.hotel/", "setReservationWM_AuthResponse");
    private final static QName _ToString_QNAME = new QName("http://web.service.hotel/", "toString");
    private final static QName _ToStringResponse_QNAME = new QName("http://web.service.hotel/", "toStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: agence.soap.apacheimport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link Chambre.Disponibilite }
     * 
     */
    public Chambre.Disponibilite createChambreDisponibilite() {
        return new Chambre.Disponibilite();
    }

    /**
     * Create an instance of {@link ChambreNonDisponibleException }
     * 
     */
    public ChambreNonDisponibleException createChambreNonDisponibleException() {
        return new ChambreNonDisponibleException();
    }

    /**
     * Create an instance of {@link ReservationFailedException }
     * 
     */
    public ReservationFailedException createReservationFailedException() {
        return new ReservationFailedException();
    }

    /**
     * Create an instance of {@link AfficherHotel }
     * 
     */
    public AfficherHotel createAfficherHotel() {
        return new AfficherHotel();
    }

    /**
     * Create an instance of {@link AfficherHotelResponse }
     * 
     */
    public AfficherHotelResponse createAfficherHotelResponse() {
        return new AfficherHotelResponse();
    }

    /**
     * Create an instance of {@link AfficherNomHotel }
     * 
     */
    public AfficherNomHotel createAfficherNomHotel() {
        return new AfficherNomHotel();
    }

    /**
     * Create an instance of {@link AfficherNomHotelResponse }
     * 
     */
    public AfficherNomHotelResponse createAfficherNomHotelResponse() {
        return new AfficherNomHotelResponse();
    }

    /**
     * Create an instance of {@link GetAdresse }
     * 
     */
    public GetAdresse createGetAdresse() {
        return new GetAdresse();
    }

    /**
     * Create an instance of {@link GetAdresseResponse }
     * 
     */
    public GetAdresseResponse createGetAdresseResponse() {
        return new GetAdresseResponse();
    }

    /**
     * Create an instance of {@link GetListeChambre }
     * 
     */
    public GetListeChambre createGetListeChambre() {
        return new GetListeChambre();
    }

    /**
     * Create an instance of {@link GetListeChambreResponse }
     * 
     */
    public GetListeChambreResponse createGetListeChambreResponse() {
        return new GetListeChambreResponse();
    }

    /**
     * Create an instance of {@link ListeChambreDisponible }
     * 
     */
    public ListeChambreDisponible createListeChambreDisponible() {
        return new ListeChambreDisponible();
    }

    /**
     * Create an instance of {@link ListeChambreDisponibleResponse }
     * 
     */
    public ListeChambreDisponibleResponse createListeChambreDisponibleResponse() {
        return new ListeChambreDisponibleResponse();
    }

    /**
     * Create an instance of {@link ListeChambreDisponibleToString }
     * 
     */
    public ListeChambreDisponibleToString createListeChambreDisponibleToString() {
        return new ListeChambreDisponibleToString();
    }

    /**
     * Create an instance of {@link ListeChambreDisponibleToStringResponse }
     * 
     */
    public ListeChambreDisponibleToStringResponse createListeChambreDisponibleToStringResponse() {
        return new ListeChambreDisponibleToStringResponse();
    }

    /**
     * Create an instance of {@link ListeTypeChambre }
     * 
     */
    public ListeTypeChambre createListeTypeChambre() {
        return new ListeTypeChambre();
    }

    /**
     * Create an instance of {@link ListeTypeChambreResponse }
     * 
     */
    public ListeTypeChambreResponse createListeTypeChambreResponse() {
        return new ListeTypeChambreResponse();
    }

    /**
     * Create an instance of {@link SetReservationWM }
     * 
     */
    public SetReservationWM createSetReservationWM() {
        return new SetReservationWM();
    }

    /**
     * Create an instance of {@link SetReservationWMResponse }
     * 
     */
    public SetReservationWMResponse createSetReservationWMResponse() {
        return new SetReservationWMResponse();
    }

    /**
     * Create an instance of {@link SetReservationWMAuth }
     * 
     */
    public SetReservationWMAuth createSetReservationWMAuth() {
        return new SetReservationWMAuth();
    }

    /**
     * Create an instance of {@link SetReservationWMAuthResponse }
     * 
     */
    public SetReservationWMAuthResponse createSetReservationWMAuthResponse() {
        return new SetReservationWMAuthResponse();
    }

    /**
     * Create an instance of {@link ToString }
     * 
     */
    public ToString createToString() {
        return new ToString();
    }

    /**
     * Create an instance of {@link ToStringResponse }
     * 
     */
    public ToStringResponse createToStringResponse() {
        return new ToStringResponse();
    }

    /**
     * Create an instance of {@link Personne }
     * 
     */
    public Personne createPersonne() {
        return new Personne();
    }

    /**
     * Create an instance of {@link Adresse }
     * 
     */
    public Adresse createAdresse() {
        return new Adresse();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link LocalDate }
     * 
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link Chambre.Disponibilite.Entry }
     * 
     */
    public Chambre.Disponibilite.Entry createChambreDisponibiliteEntry() {
        return new Chambre.Disponibilite.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChambreNonDisponibleException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChambreNonDisponibleException }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "ChambreNonDisponibleException")
    public JAXBElement<ChambreNonDisponibleException> createChambreNonDisponibleException(ChambreNonDisponibleException value) {
        return new JAXBElement<ChambreNonDisponibleException>(_ChambreNonDisponibleException_QNAME, ChambreNonDisponibleException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationFailedException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReservationFailedException }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "ReservationFailedException")
    public JAXBElement<ReservationFailedException> createReservationFailedException(ReservationFailedException value) {
        return new JAXBElement<ReservationFailedException>(_ReservationFailedException_QNAME, ReservationFailedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherHotel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AfficherHotel }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "afficherHotel")
    public JAXBElement<AfficherHotel> createAfficherHotel(AfficherHotel value) {
        return new JAXBElement<AfficherHotel>(_AfficherHotel_QNAME, AfficherHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherHotelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AfficherHotelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "afficherHotelResponse")
    public JAXBElement<AfficherHotelResponse> createAfficherHotelResponse(AfficherHotelResponse value) {
        return new JAXBElement<AfficherHotelResponse>(_AfficherHotelResponse_QNAME, AfficherHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherNomHotel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AfficherNomHotel }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "afficherNomHotel")
    public JAXBElement<AfficherNomHotel> createAfficherNomHotel(AfficherNomHotel value) {
        return new JAXBElement<AfficherNomHotel>(_AfficherNomHotel_QNAME, AfficherNomHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherNomHotelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AfficherNomHotelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "afficherNomHotelResponse")
    public JAXBElement<AfficherNomHotelResponse> createAfficherNomHotelResponse(AfficherNomHotelResponse value) {
        return new JAXBElement<AfficherNomHotelResponse>(_AfficherNomHotelResponse_QNAME, AfficherNomHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdresse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAdresse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "getAdresse")
    public JAXBElement<GetAdresse> createGetAdresse(GetAdresse value) {
        return new JAXBElement<GetAdresse>(_GetAdresse_QNAME, GetAdresse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdresseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAdresseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "getAdresseResponse")
    public JAXBElement<GetAdresseResponse> createGetAdresseResponse(GetAdresseResponse value) {
        return new JAXBElement<GetAdresseResponse>(_GetAdresseResponse_QNAME, GetAdresseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeChambre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListeChambre }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "getListeChambre")
    public JAXBElement<GetListeChambre> createGetListeChambre(GetListeChambre value) {
        return new JAXBElement<GetListeChambre>(_GetListeChambre_QNAME, GetListeChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeChambreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListeChambreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "getListeChambreResponse")
    public JAXBElement<GetListeChambreResponse> createGetListeChambreResponse(GetListeChambreResponse value) {
        return new JAXBElement<GetListeChambreResponse>(_GetListeChambreResponse_QNAME, GetListeChambreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeChambreDisponible }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeChambreDisponible }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "listeChambreDisponible")
    public JAXBElement<ListeChambreDisponible> createListeChambreDisponible(ListeChambreDisponible value) {
        return new JAXBElement<ListeChambreDisponible>(_ListeChambreDisponible_QNAME, ListeChambreDisponible.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeChambreDisponibleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeChambreDisponibleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "listeChambreDisponibleResponse")
    public JAXBElement<ListeChambreDisponibleResponse> createListeChambreDisponibleResponse(ListeChambreDisponibleResponse value) {
        return new JAXBElement<ListeChambreDisponibleResponse>(_ListeChambreDisponibleResponse_QNAME, ListeChambreDisponibleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeChambreDisponibleToString }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeChambreDisponibleToString }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "listeChambreDisponibleToString")
    public JAXBElement<ListeChambreDisponibleToString> createListeChambreDisponibleToString(ListeChambreDisponibleToString value) {
        return new JAXBElement<ListeChambreDisponibleToString>(_ListeChambreDisponibleToString_QNAME, ListeChambreDisponibleToString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeChambreDisponibleToStringResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeChambreDisponibleToStringResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "listeChambreDisponibleToStringResponse")
    public JAXBElement<ListeChambreDisponibleToStringResponse> createListeChambreDisponibleToStringResponse(ListeChambreDisponibleToStringResponse value) {
        return new JAXBElement<ListeChambreDisponibleToStringResponse>(_ListeChambreDisponibleToStringResponse_QNAME, ListeChambreDisponibleToStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeTypeChambre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeTypeChambre }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "listeTypeChambre")
    public JAXBElement<ListeTypeChambre> createListeTypeChambre(ListeTypeChambre value) {
        return new JAXBElement<ListeTypeChambre>(_ListeTypeChambre_QNAME, ListeTypeChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeTypeChambreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeTypeChambreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "listeTypeChambreResponse")
    public JAXBElement<ListeTypeChambreResponse> createListeTypeChambreResponse(ListeTypeChambreResponse value) {
        return new JAXBElement<ListeTypeChambreResponse>(_ListeTypeChambreResponse_QNAME, ListeTypeChambreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetReservationWM }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetReservationWM }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "setReservationWM")
    public JAXBElement<SetReservationWM> createSetReservationWM(SetReservationWM value) {
        return new JAXBElement<SetReservationWM>(_SetReservationWM_QNAME, SetReservationWM.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetReservationWMResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetReservationWMResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "setReservationWMResponse")
    public JAXBElement<SetReservationWMResponse> createSetReservationWMResponse(SetReservationWMResponse value) {
        return new JAXBElement<SetReservationWMResponse>(_SetReservationWMResponse_QNAME, SetReservationWMResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetReservationWMAuth }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetReservationWMAuth }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "setReservationWM_Auth")
    public JAXBElement<SetReservationWMAuth> createSetReservationWMAuth(SetReservationWMAuth value) {
        return new JAXBElement<SetReservationWMAuth>(_SetReservationWMAuth_QNAME, SetReservationWMAuth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetReservationWMAuthResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetReservationWMAuthResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "setReservationWM_AuthResponse")
    public JAXBElement<SetReservationWMAuthResponse> createSetReservationWMAuthResponse(SetReservationWMAuthResponse value) {
        return new JAXBElement<SetReservationWMAuthResponse>(_SetReservationWMAuthResponse_QNAME, SetReservationWMAuthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToString }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ToString }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "toString")
    public JAXBElement<ToString> createToString(ToString value) {
        return new JAXBElement<ToString>(_ToString_QNAME, ToString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToStringResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ToStringResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://web.service.hotel/", name = "toStringResponse")
    public JAXBElement<ToStringResponse> createToStringResponse(ToStringResponse value) {
        return new JAXBElement<ToStringResponse>(_ToStringResponse_QNAME, ToStringResponse.class, null, value);
    }

}
