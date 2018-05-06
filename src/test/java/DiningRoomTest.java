import org.junit.Test;
import room.DiningRoom;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom1;

    @Before
    public void before(){
        diningRoom1 = new DiningRoom(20, false);
    }

    @Test
    public void hasCapacity() {
        assertEquals(20, diningRoom1.getCapacity());
    }
}
