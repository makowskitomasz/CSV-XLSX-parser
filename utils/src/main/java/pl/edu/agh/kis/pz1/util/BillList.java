package pl.edu.agh.kis.pz1.util;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="Faktury")
public class BillList {
    private List<Bill> listBill = new ArrayList<Bill>();

    private BillList(){
        super();
    }
    public BillList(int i) {
        if(i == 0){
            ReaderXLSX readerXLSX = new ReaderXLSX();
            readerXLSX.parserOfXLSX();
            listBill.addAll(readerXLSX.bills);
        }
        else if(i == 1){
            ReaderCSV readerCSV = new ReaderCSV();
            readerCSV.parserOfCSV();
            listBill.addAll(readerCSV.bills);
        }

    }

    @XmlElement(name = "Faktura")
    public List<Bill> getBillList() {
        return listBill;
    }

    public void setBillList(List<Bill> listBill) {
        this.listBill = listBill;
    }
}
