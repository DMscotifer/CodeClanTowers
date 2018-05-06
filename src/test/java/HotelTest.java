import guest.Guest;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import room.Bedroom;
import room.Conference;
import room.DiningRoom;
import room.Type;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel1;
    ArrayList<DiningRoom> diningRooms;
    ArrayList<Bedroom> bedrooms = new ArrayList<>();
    ArrayList<Conference> conferences = new ArrayList<>();
    ArrayList<Guest> occupants = new ArrayList<>();

    Guest guest1 = new Guest("John Smith");
    Guest guest2 = new Guest("Jane Doe");
    Guest guest3 = new Guest("Keyser Soze");
    Guest guest4 = new Guest("Takeshi Kovacs");
    Bedroom room1 = new Bedroom(2, true, 1, Type.SINGLE, 80);


    @Before
    public void before(){
        bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(new Bedroom(2, true, 1, Type.DOUBLE, 120.00));
        conferences = new ArrayList<Conference>();
        conferences.add(new Conference(20, true, "Turing Lounge", 250.00));
        diningRooms = new ArrayList<DiningRoom>();

        occupants.add(guest1);
        occupants.add(guest2);
        occupants.add(guest3);
        occupants.add(guest4);
        hotel1 = new Hotel(diningRooms, bedrooms, conferences, occupants);
    }

    @Test
    public void bedroomsArrayNotZero() {
        assertEquals(1, hotel1.getBedrooms().size());
    }
}

