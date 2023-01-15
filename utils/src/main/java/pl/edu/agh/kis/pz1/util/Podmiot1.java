package pl.edu.agh.kis.pz1.util;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tns:Podmiot1")
public class Podmiot1 {
    private final String NIP = "6762484560";
    private final String PelnaNazwa = "\"CORE LOGIC\" SPÓŁKA Z OGRANICZONĄ ODPOWIEDZIALNOŚCIĄ";

    public Podmiot1() {
        super();
    }
    @XmlElement
    public String getNIP() {
        return NIP;
    }
    @XmlElement
    public String getPelnaNazwa() {
        return PelnaNazwa;
    }
}
