
package agence.soap.apacheimport;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.3
 * 2025-01-14T23:17:59.247+01:00
 * Generated source version: 4.0.3
 */

@WebFault(name = "ChambreNonDisponibleException", targetNamespace = "http://web.service.hotel/")
public class ChambreNonDisponibleException_Exception extends Exception {

    private agence.soap.apacheimport.ChambreNonDisponibleException faultInfo;

    public ChambreNonDisponibleException_Exception() {
        super();
    }

    public ChambreNonDisponibleException_Exception(String message) {
        super(message);
    }

    public ChambreNonDisponibleException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ChambreNonDisponibleException_Exception(String message, agence.soap.apacheimport.ChambreNonDisponibleException chambreNonDisponibleException) {
        super(message);
        this.faultInfo = chambreNonDisponibleException;
    }

    public ChambreNonDisponibleException_Exception(String message, agence.soap.apacheimport.ChambreNonDisponibleException chambreNonDisponibleException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = chambreNonDisponibleException;
    }

    public agence.soap.apacheimport.ChambreNonDisponibleException getFaultInfo() {
        return this.faultInfo;
    }
}
