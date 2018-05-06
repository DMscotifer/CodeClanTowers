import room.Bedroom;
import room.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(2, true, 1, Type.DOUBLE, 80);
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(1, bedroom1.getRoomNo());
    }

    @Test
    public void hasBedroomType() {
        assertEquals(Type.DOUBLE, bedroom1.getType());
    }

    @Test
    public void hasRate() {
        assertEquals(80.00, bedroom1.getRate(), 0.01);
    }
}
