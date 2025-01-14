
package agence.soap.apacheimport;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.3
 * 2025-01-14T23:17:59.087+01:00
 * Generated source version: 4.0.3
 */

@WebFault(name = "ReservationFailedException", targetNamespace = "http://web.service.hotel/")
public class ReservationFailedException_Exception extends Exception {

    private agence.soap.apacheimport.ReservationFailedException faultInfo;

    public ReservationFailedException_Exception() {
        super();
    }

    public ReservationFailedException_Exception(String message) {
        super(message);
    }

    public ReservationFailedException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ReservationFailedException_Exception(String message, agence.soap.apacheimport.ReservationFailedException reservationFailedException) {
        super(message);
        this.faultInfo = reservationFailedException;
    }

    public ReservationFailedException_Exception(String message, agence.soap.apacheimport.ReservationFailedException reservationFailedException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = reservationFailedException;
    }

    public agence.soap.apacheimport.ReservationFailedException getFaultInfo() {
        return this.faultInfo;
    }
}
