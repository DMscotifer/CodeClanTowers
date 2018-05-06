import org.junit.Before;
import org.junit.Test;
import room.Conference;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    Conference conference;

    @Before
    public void before(){
        conference = new Conference(20, true, "The Turing Room", 250.00);
    }

    @Test
    public void hasCapacity() {
        assertEquals(20, conference.getCapacity());
    }

    @Test
    public void isChargeable() {
        assertEquals(true, conference.isChargeable());
    }
}
