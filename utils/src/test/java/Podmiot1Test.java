import org.junit.Test;
import pl.edu.agh.kis.pz1.util.Podmiot1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Podmiot1Test {

    Podmiot1 podmiot1 = new Podmiot1();
    @Test
    public void podmiot1ObjectCalled(){
        assertNotNull(podmiot1);
    }

    @Test
    public void rightGetters(){
        assertEquals("6762484560", podmiot1.getNIP());
        assertEquals("\"CORE LOGIC\" SPÓŁKA Z OGRANICZONĄ ODPOWIEDZIALNOŚCIĄ", podmiot1.getPelnaNazwa());
    }

}
