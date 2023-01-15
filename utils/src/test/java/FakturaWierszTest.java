import org.junit.Test;
import pl.edu.agh.kis.pz1.util.FakturaWiersz;
import pl.edu.agh.kis.pz1.util.ReaderXLSX;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FakturaWierszTest {

    private final List<FakturaWiersz> fakturaWierszList = new ArrayList<FakturaWiersz>();

    ReaderXLSX readerXLSX = new ReaderXLSX();

    @Test
    public void shouldCreateFakturaWierszObject(){
        FakturaWiersz fakturaWiersz = new FakturaWiersz();
        assertNotNull("FakturaWiersz object called.", fakturaWiersz);
    }
    @Test
    public void rightGetters(){
        readerXLSX.parserOfXLSX();
        fakturaWierszList.addAll(readerXLSX.fakturaWierszList);
        assertEquals("3-09/10/2020", readerXLSX.fakturaWierszList.get(0).getP_2B());
        assertEquals("23.0", String.valueOf(readerXLSX.fakturaWierszList.get(0).getP_12()));
        assertEquals("Sprzedaż usług krajowych", readerXLSX.fakturaWierszList.get(0).getP_7());
        assertEquals("szt", readerXLSX.fakturaWierszList.get(0).getP_8A());
        assertEquals("1.0", String.valueOf(readerXLSX.fakturaWierszList.get(0).getP_8B()));
        assertEquals("3000.0", String.valueOf(readerXLSX.fakturaWierszList.get(0).getP_9A()));
        assertEquals("3690.0", String.valueOf(readerXLSX.fakturaWierszList.get(0).getP_9B()));
        assertEquals("3000.0", String.valueOf(readerXLSX.fakturaWierszList.get(0).getP_11()));
    }
}
