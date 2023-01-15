package pl.edu.agh.kis.pz1.util;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlType(propOrder = {"p_2B", "p_7", "p_8A", "p_8B", "p_9A", "p_9B", "p_11", "p_12"})
@XmlRootElement(name="FakturaWiersz")
public class FakturaWiersz {

    private String P_2B, P_12, P_9B;
    private final String P_7 = "Sprzedaż usług krajowych", P_8A = "szt";
    private BigDecimal P_8B, P_9A, P_11;

    public FakturaWiersz(){
        super();
    }

    FakturaWiersz(String P_2B, String P_12, BigDecimal P_8B, BigDecimal P_9A, String P_9B, BigDecimal P_11){
        this.P_2B = P_2B;
        this.P_12 = P_12;
        this.P_8B = P_8B;
        this.P_9A = P_9A;
        this.P_9B = P_9B;
        this.P_11 = P_11;
    }
    @XmlElement
    public String getP_2B() {
        return P_2B;
    }
    @XmlElement
    public String getP_12() {
        return P_12;
    }
    @XmlElement
    public String getP_7() {
        return P_7;
    }
    @XmlElement
    public String getP_8A() {
        return P_8A;
    }
    @XmlElement
    public BigDecimal getP_8B() {
        return P_8B;
    }
    @XmlElement
    public BigDecimal getP_9A() {
        return P_9A;
    }
    @XmlElement
    public String getP_9B() {
        return P_9B;
    }
    @XmlElement
    public BigDecimal getP_11() {
        return P_11;
    }
}
