package hotel;

import guest.Guest;
import room.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<DiningRoom> diningRooms = new ArrayList<>();
    private ArrayList<Bedroom> bedrooms = new ArrayList<>();
    private ArrayList<Conference> conferences = new ArrayList<>();
    private ArrayList<Guest> guests = new ArrayList<>();

    public Hotel(ArrayList<DiningRoom> diningRooms, ArrayList<Bedroom> bedrooms, ArrayList<Conference> conferences, ArrayList<Guest> guests) {
        this.diningRooms = diningRooms;
        this.bedrooms = bedrooms;
        this.conferences = conferences;
        this.guests = guests;
    }

    public ArrayList<DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public void setDiningRooms(ArrayList<DiningRoom> diningRooms) {
        this.diningRooms = diningRooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<Conference> getConferences() {
        return conferences;
    }

    public void setConferences(ArrayList<Conference> conferences) {
        this.conferences = conferences;
    }

    public Bedroom findRoom(int roomChoice) {
        for (Bedroom room : bedrooms) {
            if (roomChoice == room.getRoomNo()) {
                return room;
            }
        }
        return null;
    }
}
