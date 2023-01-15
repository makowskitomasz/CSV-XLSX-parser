package pl.edu.agh.kis.pz1.util;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement(name="FakturaCtrl")
public class FakturaCtrl {
    private int liczbaFaktur;
    private BigDecimal wartoscFaktur = new BigDecimal(0);

    private FakturaCtrl(){
        super();
    }
    public FakturaCtrl(int i) {
        if(i == 0){
            ReaderXLSX readerXLSX = new ReaderXLSX();
            readerXLSX.parserOfXLSX();
            for(Bill bill : readerXLSX.bills){
                liczbaFaktur += 1;
                wartoscFaktur = wartoscFaktur.add(new BigDecimal(String.valueOf(bill.getP_14_1())));
            }
        }
        else if(i == 1){
            ReaderCSV readerCSV = new ReaderCSV();
            readerCSV.parserOfCSV();
            for(Bill bill : readerCSV.bills){
                liczbaFaktur += 1;
                wartoscFaktur = wartoscFaktur.add(new BigDecimal(String.valueOf(bill.getP_14_1())));
            }
        }
    }

    @XmlElement
    public int getLiczbaFaktur() {
        return liczbaFaktur;
    }

    @XmlElement
    public BigDecimal getWartoscFaktur() {
        return wartoscFaktur;
    }
}
