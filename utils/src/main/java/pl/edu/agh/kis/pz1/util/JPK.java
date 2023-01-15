package pl.edu.agh.kis.pz1.util;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"naglowek", "podmiot1", "billList", "fakturaCtrl", "listFakturaWiersz", "fakturaWierszCtrl"})
@XmlRootElement(name = "JPK")
public class JPK {

    private Naglowek naglowek;
    private Podmiot1 podmiot1;
    private BillList billList;
    private FakturaCtrl fakturaCtrl;
    private ListFakturaWiersz listFakturaWiersz;
    private FakturaWierszCtrl fakturaWierszCtrl;

    public JPK(){
        super();
    }
    public JPK(int i) {
            super();
            podmiot1 = new Podmiot1();
            billList = new BillList(i);
            fakturaCtrl = new FakturaCtrl(i);
            listFakturaWiersz = new ListFakturaWiersz(i);
            fakturaWierszCtrl = new FakturaWierszCtrl(i);
            naglowek = new Naglowek();
        }
    @XmlElement
    public Naglowek getNaglowek() {
        return naglowek;
    }

    @XmlElement
    public Podmiot1 getPodmiot1() {
        return podmiot1;
    }
    @XmlElement
    public BillList getBillList() {
        return billList;
    }
    @XmlElement
    public FakturaCtrl getFakturaCtrl() {
        return fakturaCtrl;
    }
    @XmlElement
    public ListFakturaWiersz getListFakturaWiersz() {
        return listFakturaWiersz;
    }
    @XmlElement
    public FakturaWierszCtrl getFakturaWierszCtrl() {
        return fakturaWierszCtrl;
    }
}
