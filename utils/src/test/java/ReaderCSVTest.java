import org.junit.Test;
import pl.edu.agh.kis.pz1.util.ReaderCSV;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ReaderCSVTest {
    ReaderCSV readerCSV = new ReaderCSV();

    @Test
    public void readerCSVCalled(){
        assertNotNull(readerCSV);
    }

    @Test
    public void stringToDecimalWorksCorrectly(){
        assertEquals(new BigDecimal("1000.0"), readerCSV.stringToDecimal("1000,0 zł"));
        assertEquals(new BigDecimal("15.00"), readerCSV.stringToDecimal("15,00 zł"));
    }

    @Test
    public void parserWorksCorrectly(){
        readerCSV.parserOfCSV();
        assertNotEquals(null, readerCSV.bills);
        assertNotEquals(null, readerCSV.fakturaWierszList);
        assertEquals(readerCSV.bills.size(), readerCSV.fakturaWierszList.size());
    }
}
