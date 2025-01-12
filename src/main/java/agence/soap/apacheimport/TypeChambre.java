
package agence.soap.apacheimport;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeChambre.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
