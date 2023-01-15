import org.junit.Test;
import pl.edu.agh.kis.pz1.util.FakturaCtrl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FakturaCtrlTest {
    FakturaCtrl fakturaCtrl = new FakturaCtrl(0);

    @Test
    public void fakturaCtrlCalled(){
        assertNotNull(fakturaCtrl);
    }

    @Test
    public void testGetLiczbaFaktur() {
        assertEquals(107,fakturaCtrl.getLiczbaFaktur());
    }

    @Test
    public void testGetWartoscFaktur(){
        assertEquals("2461.0", String.valueOf(fakturaCtrl.getWartoscFaktur()));
    }
}
