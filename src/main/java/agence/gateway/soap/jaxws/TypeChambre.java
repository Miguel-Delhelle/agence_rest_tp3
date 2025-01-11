
package agence.gateway.soap.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeChambre.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeChambre"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SIMPLE"/&gt;
 *     &lt;enumeration value="DOUBLE"/&gt;
 *     &lt;enumeration value="SUITE"/&gt;
 *     &lt;enumeration value="LUXE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeChambre")
@XmlEnum
public enum TypeChambre {

    SIMPLE,
    DOUBLE,
    SUITE,
    LUXE;

    public String value() {
        return name();
    }

    public static TypeChambre fromValue(String v) {
        return valueOf(v);
    }

}
