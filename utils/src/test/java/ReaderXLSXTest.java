import org.junit.Test;
import pl.edu.agh.kis.pz1.util.ReaderXLSX;

import static org.junit.Assert.*;

public class ReaderXLSXTest {
    ReaderXLSX readerXLSX = new ReaderXLSX();

    @Test
    public void readerObjectCalled(){
        assertNotNull(readerXLSX);
    }

    @Test
    public void parserWorksCorrectly(){
        readerXLSX.parserOfXLSX();
        assertNotEquals(null, readerXLSX.bills);
        assertNotEquals(null, readerXLSX.fakturaWierszList);
        assertEquals(readerXLSX.bills.size(), readerXLSX.fakturaWierszList.size());
    }}
