
package agence.gateway.soap.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nationalite.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="nationalite"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFGHAN"/&gt;
 *     &lt;enumeration value="ALBANAIS"/&gt;
 *     &lt;enumeration value="ALGERIEN"/&gt;
 *     &lt;enumeration value="AMERICAIN"/&gt;
 *     &lt;enumeration value="ANDORRAN"/&gt;
 *     &lt;enumeration value="ANGOLAIS"/&gt;
 *     &lt;enumeration value="ARGENTIN"/&gt;
 *     &lt;enumeration value="ARMENIEN"/&gt;
 *     &lt;enumeration value="AUSTRALIEN"/&gt;
 *     &lt;enumeration value="AUTRICHIEN"/&gt;
 *     &lt;enumeration value="AZERI"/&gt;
 *     &lt;enumeration value="BAHAMEEN"/&gt;
 *     &lt;enumeration value="BAHREINIEN"/&gt;
 *     &lt;enumeration value="BANGLADAIS"/&gt;
 *     &lt;enumeration value="BARBADIEN"/&gt;
 *     &lt;enumeration value="BELARUSSE"/&gt;
 *     &lt;enumeration value="BELGE"/&gt;
 *     &lt;enumeration value="BELIZIEN"/&gt;
 *     &lt;enumeration value="BENINOIS"/&gt;
 *     &lt;enumeration value="BHOUTANAIS"/&gt;
 *     &lt;enumeration value="BOLIVIEN"/&gt;
 *     &lt;enumeration value="BOSNIEN"/&gt;
 *     &lt;enumeration value="BOTSWANAIS"/&gt;
 *     &lt;enumeration value="BRESILIEN"/&gt;
 *     &lt;enumeration value="BRITANNIQUE"/&gt;
 *     &lt;enumeration value="BRUNEIEN"/&gt;
 *     &lt;enumeration value="BULGARE"/&gt;
 *     &lt;enumeration value="BURKINABE"/&gt;
 *     &lt;enumeration value="BURUNDAIS"/&gt;
 *     &lt;enumeration value="CAMBODGIEN"/&gt;
 *     &lt;enumeration value="CAMEROUNAIS"/&gt;
 *     &lt;enumeration value="CANADIEN"/&gt;
 *     &lt;enumeration value="CAP_VERDIEN"/&gt;
 *     &lt;enumeration value="CENTRAFRICAIN"/&gt;
 *     &lt;enumeration value="TCHADIEN"/&gt;
 *     &lt;enumeration value="CHILIEN"/&gt;
 *     &lt;enumeration value="CHINOIS"/&gt;
 *     &lt;enumeration value="COLOMBIEN"/&gt;
 *     &lt;enumeration value="COMORES"/&gt;
 *     &lt;enumeration value="CONGOLAIS"/&gt;
 *     &lt;enumeration value="COSTARICIEN"/&gt;
 *     &lt;enumeration value="CROATE"/&gt;
 *     &lt;enumeration value="CUBAIN"/&gt;
 *     &lt;enumeration value="DANOIS"/&gt;
 *     &lt;enumeration value="DJIBOUTIEN"/&gt;
 *     &lt;enumeration value="DOMINICAIN"/&gt;
 *     &lt;enumeration value="EGYPTIEN"/&gt;
 *     &lt;enumeration value="EMIRIEN"/&gt;
 *     &lt;enumeration value="EQUATORIEN"/&gt;
 *     &lt;enumeration value="ESPAGNOL"/&gt;
 *     &lt;enumeration value="ESTONIEN"/&gt;
 *     &lt;enumeration value="ETHIOPIEN"/&gt;
 *     &lt;enumeration value="FINLANDAIS"/&gt;
 *     &lt;enumeration value="FRANÇAIS"/&gt;
 *     &lt;enumeration value="GABONAIS"/&gt;
 *     &lt;enumeration value="GAMBIEN"/&gt;
 *     &lt;enumeration value="GEORGIEN"/&gt;
 *     &lt;enumeration value="GHANEEN"/&gt;
 *     &lt;enumeration value="GREC"/&gt;
 *     &lt;enumeration value="GRENADIN"/&gt;
 *     &lt;enumeration value="GUATEMALTEQUE"/&gt;
 *     &lt;enumeration value="GUINEEN"/&gt;
 *     &lt;enumeration value="GUYANAISE"/&gt;
 *     &lt;enumeration value="HAITIEN"/&gt;
 *     &lt;enumeration value="HONDURIEN"/&gt;
 *     &lt;enumeration value="HONGROIS"/&gt;
 *     &lt;enumeration value="INDIEN"/&gt;
 *     &lt;enumeration value="INDONESIEN"/&gt;
 *     &lt;enumeration value="IRAKIEN"/&gt;
 *     &lt;enumeration value="IRANIEN"/&gt;
 *     &lt;enumeration value="IRLANDAIS"/&gt;
 *     &lt;enumeration value="ISLANDAIS"/&gt;
 *     &lt;enumeration value="ISRAELIEN"/&gt;
 *     &lt;enumeration value="ITALIEN"/&gt;
 *     &lt;enumeration value="IVOIRIEN"/&gt;
 *     &lt;enumeration value="JAMAICAIN"/&gt;
 *     &lt;enumeration value="JAPONAIS"/&gt;
 *     &lt;enumeration value="JORDANIEN"/&gt;
 *     &lt;enumeration value="KAZAKH"/&gt;
 *     &lt;enumeration value="KENYAN"/&gt;
 *     &lt;enumeration value="KIRGHIZE"/&gt;
 *     &lt;enumeration value="KIRIBATIEN"/&gt;
 *     &lt;enumeration value="KOSOVAR"/&gt;
 *     &lt;enumeration value="KOWEITIEN"/&gt;
 *     &lt;enumeration value="LAOTIEN"/&gt;
 *     &lt;enumeration value="LETTON"/&gt;
 *     &lt;enumeration value="LIBANAIS"/&gt;
 *     &lt;enumeration value="LIBERIEN"/&gt;
 *     &lt;enumeration value="LIBYEN"/&gt;
 *     &lt;enumeration value="LITUANIEN"/&gt;
 *     &lt;enumeration value="LUXEMBOURGEOIS"/&gt;
 *     &lt;enumeration value="MACEDONIEN"/&gt;
 *     &lt;enumeration value="MALGACHE"/&gt;
 *     &lt;enumeration value="MALAISE"/&gt;
 *     &lt;enumeration value="MALAWITE"/&gt;
 *     &lt;enumeration value="MALDIVIEN"/&gt;
 *     &lt;enumeration value="MALIEN"/&gt;
 *     &lt;enumeration value="MALTE"/&gt;
 *     &lt;enumeration value="MAROCAIN"/&gt;
 *     &lt;enumeration value="MARSHALLESE"/&gt;
 *     &lt;enumeration value="MAURICIEN"/&gt;
 *     &lt;enumeration value="MAURITANIEN"/&gt;
 *     &lt;enumeration value="MEXICAIN"/&gt;
 *     &lt;enumeration value="MICRONESIEN"/&gt;
 *     &lt;enumeration value="MOLDAVE"/&gt;
 *     &lt;enumeration value="MONEGASQUE"/&gt;
 *     &lt;enumeration value="MONGOLE"/&gt;
 *     &lt;enumeration value="MONTENEGRIN"/&gt;
 *     &lt;enumeration value="MOZAMBICAIN"/&gt;
 *     &lt;enumeration value="NAMIBIEN"/&gt;
 *     &lt;enumeration value="NEPALAIS"/&gt;
 *     &lt;enumeration value="NICARAGUAYEN"/&gt;
 *     &lt;enumeration value="NIGERIEN"/&gt;
 *     &lt;enumeration value="NIGERIENNE"/&gt;
 *     &lt;enumeration value="NORVEGIEN"/&gt;
 *     &lt;enumeration value="NEO_ZELANDAIS"/&gt;
 *     &lt;enumeration value="OUGANDAIS"/&gt;
 *     &lt;enumeration value="OUZBEK"/&gt;
 *     &lt;enumeration value="PAKISTANAIS"/&gt;
 *     &lt;enumeration value="PALAUAN"/&gt;
 *     &lt;enumeration value="PALESTINIEN"/&gt;
 *     &lt;enumeration value="PANAMEEN"/&gt;
 *     &lt;enumeration value="PAPOU"/&gt;
 *     &lt;enumeration value="PARAGUAYEN"/&gt;
 *     &lt;enumeration value="NEERLANDAIS"/&gt;
 *     &lt;enumeration value="PERUVIEN"/&gt;
 *     &lt;enumeration value="PHILIPPIN"/&gt;
 *     &lt;enumeration value="POLONAIS"/&gt;
 *     &lt;enumeration value="PORTUGAIS"/&gt;
 *     &lt;enumeration value="QATARI"/&gt;
 *     &lt;enumeration value="TCHEQUE"/&gt;
 *     &lt;enumeration value="ROUMAIN"/&gt;
 *     &lt;enumeration value="ROYOMAN"/&gt;
 *     &lt;enumeration value="RUSSE"/&gt;
 *     &lt;enumeration value="RWANDAIS"/&gt;
 *     &lt;enumeration value="SAOUDIEN"/&gt;
 *     &lt;enumeration value="SENEGALAIS"/&gt;
 *     &lt;enumeration value="SERBE"/&gt;
 *     &lt;enumeration value="SINGAPOUR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "nationalite")
@XmlEnum
public enum Nationalite {

    AFGHAN,
    ALBANAIS,
    ALGERIEN,
    AMERICAIN,
    ANDORRAN,
    ANGOLAIS,
    ARGENTIN,
    ARMENIEN,
    AUSTRALIEN,
    AUTRICHIEN,
    AZERI,
    BAHAMEEN,
    BAHREINIEN,
    BANGLADAIS,
    BARBADIEN,
    BELARUSSE,
    BELGE,
    BELIZIEN,
    BENINOIS,
    BHOUTANAIS,
    BOLIVIEN,
    BOSNIEN,
    BOTSWANAIS,
    BRESILIEN,
    BRITANNIQUE,
    BRUNEIEN,
    BULGARE,
    BURKINABE,
    BURUNDAIS,
    CAMBODGIEN,
    CAMEROUNAIS,
    CANADIEN,
    CAP_VERDIEN,
    CENTRAFRICAIN,
    TCHADIEN,
    CHILIEN,
    CHINOIS,
    COLOMBIEN,
    COMORES,
    CONGOLAIS,
    COSTARICIEN,
    CROATE,
    CUBAIN,
    DANOIS,
    DJIBOUTIEN,
    DOMINICAIN,
    EGYPTIEN,
    EMIRIEN,
    EQUATORIEN,
    ESPAGNOL,
    ESTONIEN,
    ETHIOPIEN,
    FINLANDAIS,
    FRANÇAIS,
    GABONAIS,
    GAMBIEN,
    GEORGIEN,
    GHANEEN,
    GREC,
    GRENADIN,
    GUATEMALTEQUE,
    GUINEEN,
    GUYANAISE,
    HAITIEN,
    HONDURIEN,
    HONGROIS,
    INDIEN,
    INDONESIEN,
    IRAKIEN,
    IRANIEN,
    IRLANDAIS,
    ISLANDAIS,
    ISRAELIEN,
    ITALIEN,
    IVOIRIEN,
    JAMAICAIN,
    JAPONAIS,
    JORDANIEN,
    KAZAKH,
    KENYAN,
    KIRGHIZE,
    KIRIBATIEN,
    KOSOVAR,
    KOWEITIEN,
    LAOTIEN,
    LETTON,
    LIBANAIS,
    LIBERIEN,
    LIBYEN,
    LITUANIEN,
    LUXEMBOURGEOIS,
    MACEDONIEN,
    MALGACHE,
    MALAISE,
    MALAWITE,
    MALDIVIEN,
    MALIEN,
    MALTE,
    MAROCAIN,
    MARSHALLESE,
    MAURICIEN,
    MAURITANIEN,
    MEXICAIN,
    MICRONESIEN,
    MOLDAVE,
    MONEGASQUE,
    MONGOLE,
    MONTENEGRIN,
    MOZAMBICAIN,
    NAMIBIEN,
    NEPALAIS,
    NICARAGUAYEN,
    NIGERIEN,
    NIGERIENNE,
    NORVEGIEN,
    NEO_ZELANDAIS,
    OUGANDAIS,
    OUZBEK,
    PAKISTANAIS,
    PALAUAN,
    PALESTINIEN,
    PANAMEEN,
    PAPOU,
    PARAGUAYEN,
    NEERLANDAIS,
    PERUVIEN,
    PHILIPPIN,
    POLONAIS,
    PORTUGAIS,
    QATARI,
    TCHEQUE,
    ROUMAIN,
    ROYOMAN,
    RUSSE,
    RWANDAIS,
    SAOUDIEN,
    SENEGALAIS,
    SERBE,
    SINGAPOUR;

    public String value() {
        return name();
    }

    public static Nationalite fromValue(String v) {
        return valueOf(v);
    }

}
