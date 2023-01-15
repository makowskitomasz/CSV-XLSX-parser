import org.junit.Test;
import pl.edu.agh.kis.pz1.util.ListFakturaWiersz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ListFakturaWierszTest {
    ListFakturaWiersz listFakturaWiersz = new ListFakturaWiersz(0);

    @Test
    public void listFakturaWierszWasCalled(){
        assertNotNull(listFakturaWiersz);
    }

    @Test
    public void testGetFakturaWierszList(){
        assertEquals(107, listFakturaWiersz.getListFakturaWiersz().size());
    }

    @Test
    public void testSetFakturaWierszList(){
        listFakturaWiersz.setListFakturaWiersz(null);
        assertEquals(null, listFakturaWiersz.getListFakturaWiersz());
    }
}
