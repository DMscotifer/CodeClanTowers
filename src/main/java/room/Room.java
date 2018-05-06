package room;

import java.util.ArrayList;
import guest.Guest;

public abstract class Room {


    private int capacity;
    private ArrayList<Guest> occupants;
    private boolean chargeable;

    public Room(int capacity, boolean chargeable){
        this.capacity = capacity;
        this.occupants = new ArrayList<>();
        this.chargeable = chargeable;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getOccupants() {
        return occupants;
    }

    public void setOccupants(ArrayList<Guest> occupants) {
        this.occupants = occupants;
    }

    public boolean isChargeable() {
        return chargeable;
    }

    public void setChargeable(boolean chargeable) {
        this.chargeable = chargeable;
    }
}
