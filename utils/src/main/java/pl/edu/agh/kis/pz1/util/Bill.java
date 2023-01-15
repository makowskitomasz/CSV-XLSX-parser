package pl.edu.agh.kis.pz1.util;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlType(propOrder = {"kodWaluty", "p_1", "p_2A", "p_3A", "p_3B", "p_3C", "p_3D", "p_4A", "p_4B", "p_5B", "p_6", "p_13_1", "p_14_1",
"p_15", "p_16", "p_17", "p_18", "p_18A", "p_19", "p_20", "p_21", "p_22", "p_23", "p_106E_2", "p_106E_3", "rodzajFaktury"})
@XmlRootElement(name="Faktury")
public class Bill {
    String KodWaluty = "PLN";
    String P_1, P_2A, P_3A, P_3B, P_5B, P_6;
    BigDecimal P_13_1, P_14_1, P_15;
    Boolean P_16 = false, P_17 = false, P_18 = false, P_18A = false, P_19 = false, P_20 = false, P_21 = false, P_22 = false, P_23 = false, P_106E_2 = false, P_106E_3 = false;

    String P_3C = "\"CORE LOGIC\" SPÓŁKA Z OGRANICZONĄ ODPOWIEDZIALNOŚCIĄ";
    String P_3D = "ul. Feliksa Radwańskiego 15/1, 30-065 Kraków";
    String P_4A = "PL";
    String P_4B = "6762484560";
    String RodzajFaktury = "VAT";

    Bill(){
        super();
    }

    Bill(String P_3A, String P_3B, String P_5B, String P_1, String P_6, String P_2A, BigDecimal P_13_1, BigDecimal P_14_1, BigDecimal P_15){
        this.P_1 = P_1;
        this.P_3A = P_3A;
        this.P_2A = P_2A;
        this.P_3B = P_3B;
        this.P_5B = P_5B;
        this.P_6 = P_6;
        this.P_13_1 = P_13_1;
        this.P_14_1 = P_14_1;
        this.P_15 = P_15;
    }
    @XmlElement
    public String getKodWaluty() {
        return KodWaluty;
    }
    @XmlElement
    public String getP_1() {
        return P_1;
    }
    @XmlElement
    public String getP_2A() {
        return P_2A;
    }
    @XmlElement
    public String getP_3A() {
        return P_3A;
    }
    @XmlElement
    public String getP_3B() {
        return P_3B;
    }
    @XmlElement
    public String getP_5B() {
        return P_5B;
    }
    @XmlElement
    public String getP_6() {
        return P_6;
    }
    @XmlElement
    public BigDecimal getP_13_1() {
        return P_13_1;
    }
    @XmlElement
    public BigDecimal getP_14_1() {
        return P_14_1;
    }
    @XmlElement
    public BigDecimal getP_15() {
        return P_15;
    }
    @XmlElement
    public Boolean getP_16() {
        return P_16;
    }
    @XmlElement
    public Boolean getP_17() {
        return P_17;
    }
    @XmlElement
    public Boolean getP_18() {
        return P_18;
    }
    @XmlElement
    public Boolean getP_18A() {
        return P_18A;
    }
    @XmlElement
    public Boolean getP_19() {
        return P_19;
    }
    @XmlElement
    public Boolean getP_20() {
        return P_20;
    }
    @XmlElement
    public Boolean getP_21() {
        return P_21;
    }
    @XmlElement
    public Boolean getP_22() {
        return P_22;
    }
    @XmlElement
    public Boolean getP_23() {
        return P_23;
    }
    @XmlElement
    public Boolean getP_106E_2() {
        return P_106E_2;
    }
    @XmlElement
    public Boolean getP_106E_3() {
        return P_106E_3;
    }
    @XmlElement
    public String getP_3C() {
        return P_3C;
    }
    @XmlElement
    public String getP_3D() {
        return P_3D;
    }
    @XmlElement
    public String getP_4A() {
        return P_4A;
    }
    @XmlElement
    public String getP_4B() {
        return P_4B;
    }
    @XmlElement
    public String getRodzajFaktury() {
        return RodzajFaktury;
    }
}
