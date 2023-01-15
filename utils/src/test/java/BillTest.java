import org.junit.Test;
import pl.edu.agh.kis.pz1.util.Bill;
import pl.edu.agh.kis.pz1.util.ReaderCSV;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BillTest {
    ReaderCSV readerCSV = new ReaderCSV();
    private List<Bill> listBill = new ArrayList<Bill>();


    @Test
    public void shouldCreateBillObject(){
        ReaderCSV readerCSV = new ReaderCSV();
        assertNotNull("Bill object called.", readerCSV);
    }

    @Test
    public void rightGetters(){
        readerCSV.parserOfCSV();
        listBill.addAll(readerCSV.bills);
        assertEquals("PLN", listBill.get(0).getKodWaluty());
        assertEquals("2020-10-09",listBill.get(0).getP_1());
        assertEquals("3-09/10/2020",listBill.get(0).getP_2A());
        assertEquals("Firma5 SP. Z O.O.",listBill.get(0).getP_3A());
        assertEquals("UL. FELIKSA RADWAŃSKIEGO 15/1, 30-065 KRAKÓW",listBill.get(0).getP_3B());
        assertEquals("UL. FELIKSA RADWAŃSKIEGO 15/1, 30-065 KRAKÓW",listBill.get(0).getP_3B());
        assertEquals("634-27-26-447",listBill.get(0).getP_5B());
        assertEquals("2020-10-09",listBill.get(0).getP_6());
        assertEquals("3000.00", String.valueOf(listBill.get(0).getP_13_1()));
        assertEquals(new BigDecimal(23) ,listBill.get(0).getP_14_1());
        assertEquals("690.00",String.valueOf(listBill.get(0).getP_15()));
        assertEquals(false ,listBill.get(0).getP_16());
        assertEquals(false,listBill.get(0).getP_17());
        assertEquals(false,listBill.get(0).getP_18());
        assertEquals(false,listBill.get(0).getP_18A());
        assertEquals(false,listBill.get(0).getP_19());
        assertEquals(false,listBill.get(0).getP_20());
        assertEquals(false,listBill.get(0).getP_21());
        assertEquals(false, listBill.get(0).getP_22());
        assertEquals(false,listBill.get(0).getP_23());
        assertEquals(false,listBill.get(0).getP_106E_2());
        assertEquals(false,listBill.get(0).getP_106E_3());
        assertEquals("\"CORE LOGIC\" SPÓŁKA Z OGRANICZONĄ ODPOWIEDZIALNOŚCIĄ",listBill.get(0).getP_3C());
        assertEquals("ul. Feliksa Radwańskiego 15/1, 30-065 Kraków",listBill.get(0).getP_3D());
        assertEquals("PL",listBill.get(0).getP_4A());
        assertEquals("6762484560",listBill.get(0).getP_4B());
        assertEquals("VAT",listBill.get(0).getRodzajFaktury());

    }
}
