package pl.edu.agh.kis.pz1.util;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="FakturaWiersze")
public class ListFakturaWiersz {
    private List<FakturaWiersz> listFakturaWiersz = new ArrayList<FakturaWiersz>();

    private ListFakturaWiersz(){
        super();
    }
    public ListFakturaWiersz(int i){
        if(i == 0){
            ReaderXLSX readerXLSX = new ReaderXLSX();
            readerXLSX.parserOfXLSX();
            listFakturaWiersz.addAll(readerXLSX.fakturaWierszList);
        }
        else if(i == 1){
            ReaderCSV readerCSV = new ReaderCSV();
            readerCSV.parserOfCSV();
            listFakturaWiersz.addAll(readerCSV.fakturaWierszList);
        }

    }

    @XmlElement(name = "FakturaWiersz")
    public List<FakturaWiersz> getListFakturaWiersz() {
        return listFakturaWiersz;
    }

    public void setListFakturaWiersz(List<FakturaWiersz> listFakturaWiersz) {
        this.listFakturaWiersz = listFakturaWiersz;
    }
}
