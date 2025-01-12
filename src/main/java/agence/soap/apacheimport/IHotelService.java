package agence.soap.apacheimport;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.FaultAction;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.3
 * 2025-01-12T15:47:45.844+01:00
 * Generated source version: 4.0.3
 *
 */
@WebService(targetNamespace = "http://web.service.hotel/", name = "IHotelService")
@XmlSeeAlso({ObjectFactory.class})
public interface IHotelService {

    @WebMethod
    @Action(input = "http://web.service.hotel/IHotelService/getAdresseRequest", output = "http://web.service.hotel/IHotelService/getAdresseResponse")
    @RequestWrapper(localName = "getAdresse", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.GetAdresse")
    @ResponseWrapper(localName = "getAdresseResponse", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.GetAdresseResponse")
    @WebResult(name = "return", targetNamespace = "")
    public agence.soap.apacheimport.Adresse getAdresse()
;

    @WebMethod
    @Action(input = "http://web.service.hotel/IHotelService/afficherHotelRequest", output = "http://web.service.hotel/IHotelService/afficherHotelResponse")
    @RequestWrapper(localName = "afficherHotel", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.AfficherHotel")
    @ResponseWrapper(localName = "afficherHotelResponse", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.AfficherHotelResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String afficherHotel()
;

    @WebMethod
    @Action(input = "http://web.service.hotel/IHotelService/listeTypeChambreRequest", output = "http://web.service.hotel/IHotelService/listeTypeChambreResponse")
    @RequestWrapper(localName = "listeTypeChambre", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.ListeTypeChambre")
    @ResponseWrapper(localName = "listeTypeChambreResponse", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.ListeTypeChambreResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<agence.soap.apacheimport.TypeChambre> listeTypeChambre()
;

    @WebMethod
    @Action(input = "http://web.service.hotel/IHotelService/setReservationWMRequest", output = "http://web.service.hotel/IHotelService/setReservationWMResponse", fault = {@FaultAction(className = ReservationFailedException_Exception.class, value = "http://web.service.hotel/IHotelService/setReservationWM/Fault/ReservationFailedException"), @FaultAction(className = ChambreNonDisponibleException_Exception.class, value = "http://web.service.hotel/IHotelService/setReservationWM/Fault/ChambreNonDisponibleException")})
    @RequestWrapper(localName = "setReservationWM", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.SetReservationWM")
    @ResponseWrapper(localName = "setReservationWMResponse", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.SetReservationWMResponse")
    public void setReservationWM(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2
    ) throws ReservationFailedException_Exception, ChambreNonDisponibleException_Exception;

    @WebMethod(operationName = "setReservationWM_Auth")
    @Action(input = "http://web.service.hotel/IHotelService/setReservationWM_AuthRequest", output = "http://web.service.hotel/IHotelService/setReservationWM_AuthResponse")
    @RequestWrapper(localName = "setReservationWM_Auth", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.SetReservationWMAuth")
    @ResponseWrapper(localName = "setReservationWM_AuthResponse", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.SetReservationWMAuthResponse")
    public void setReservationWMAuth(

        @WebParam(name = "arg0", targetNamespace = "")
        agence.soap.apacheimport.Personne arg0
    );

    @WebMethod
    @Action(input = "http://web.service.hotel/IHotelService/listeChambreDisponibleToStringRequest", output = "http://web.service.hotel/IHotelService/listeChambreDisponibleToStringResponse")
    @RequestWrapper(localName = "listeChambreDisponibleToString", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.ListeChambreDisponibleToString")
    @ResponseWrapper(localName = "listeChambreDisponibleToStringResponse", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.ListeChambreDisponibleToStringResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String listeChambreDisponibleToString(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @Action(input = "http://web.service.hotel/IHotelService/toStringRequest", output = "http://web.service.hotel/IHotelService/toStringResponse")
    @RequestWrapper(localName = "toString", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.ToString")
    @ResponseWrapper(localName = "toStringResponse", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.ToStringResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String toString()
;

    @WebMethod
    @Action(input = "http://web.service.hotel/IHotelService/afficherNomHotelRequest", output = "http://web.service.hotel/IHotelService/afficherNomHotelResponse")
    @RequestWrapper(localName = "afficherNomHotel", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.AfficherNomHotel")
    @ResponseWrapper(localName = "afficherNomHotelResponse", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.AfficherNomHotelResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String afficherNomHotel()
;

    @WebMethod
    @Action(input = "http://web.service.hotel/IHotelService/listeChambreDisponibleRequest", output = "http://web.service.hotel/IHotelService/listeChambreDisponibleResponse")
    @RequestWrapper(localName = "listeChambreDisponible", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.ListeChambreDisponible")
    @ResponseWrapper(localName = "listeChambreDisponibleResponse", targetNamespace = "http://web.service.hotel/", className = "agence.soap.apacheimport.ListeChambreDisponibleResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<agence.soap.apacheimport.Chambre> listeChambreDisponible(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );
}
