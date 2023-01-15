import org.junit.Test;
import pl.edu.agh.kis.pz1.util.BillList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BillListTest {
    BillList billList = new BillList(0);

    @Test
    public void billListCalled(){
        assertNotNull(billList);
    }

    @Test
    public void testGetBillList() {
        assertEquals(107, billList.getBillList().size());
    }

    @Test
    public void testSetBillList() {
        billList.setBillList(null);
        assertEquals(null, billList.getBillList());
    }


}
