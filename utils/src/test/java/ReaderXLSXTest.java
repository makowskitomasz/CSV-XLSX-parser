import org.junit.Test;
import pl.edu.agh.kis.pz1.util.ReaderXLSX;

import static org.junit.Assert.*;

/**
 * A class that tests the ReaderXLSX class
 */
public class ReaderXLSXTest {
    ReaderXLSX readerXLSX = new ReaderXLSX();

    /**
     * Test for the construction of ReaderXLSX
     */
    @Test
    public void readerObjectCalled(){
        assertNotNull(readerXLSX);
    }

    /**
     * Test for the parserOfXLSX method
     */
    @Test
    public void parserWorksCorrectly(){
        readerXLSX.parserOfXLSX();
        assertNotEquals(null, readerXLSX.getBills());
        assertNotEquals(null, readerXLSX.getFakturaWierszList());
        assertEquals(readerXLSX.getBills().size(), readerXLSX.getFakturaWierszList().size());
    }}
