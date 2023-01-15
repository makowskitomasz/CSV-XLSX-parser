package pl.edu.agh.kis.pz1.util;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
@XmlRootElement(name="FakturaWierszCtrl")
public class FakturaWierszCtrl {
    private int liczbaWierszyFaktur;
    private BigDecimal wartoscWierszyFaktur = new BigDecimal(0);


    private FakturaWierszCtrl(){
        super();
    }
    public FakturaWierszCtrl(int i) {
        if(i == 0){
            ReaderXLSX readerXLSX = new ReaderXLSX();
            readerXLSX.parserOfXLSX();
            for (FakturaWiersz fakturaWiersz : readerXLSX.fakturaWierszList) {
                liczbaWierszyFaktur += 1;
                wartoscWierszyFaktur = wartoscWierszyFaktur.add(new BigDecimal(String.valueOf(fakturaWiersz.getP_11())));
            }
        }
        else if(i == 1){
            ReaderCSV readerCSV = new ReaderCSV();
            readerCSV.parserOfCSV();
            for (FakturaWiersz fakturaWiersz : readerCSV.fakturaWierszList){
                liczbaWierszyFaktur += 1;
                wartoscWierszyFaktur = wartoscWierszyFaktur.add(new BigDecimal(String.valueOf(fakturaWiersz.getP_11())));
            }
        }


    }
    @XmlElement
    public int getLiczbaWierszyFaktur() {
        return liczbaWierszyFaktur;
    }
    @XmlElement
    public BigDecimal getWartoscWierszyFaktur() {
        return wartoscWierszyFaktur;
    }
}
