package rooms;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private Integer rate;
    private Type roomType;
    private ArrayList<String> guestArray;

    public Room(String name, Integer rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public ArrayList<String> getGuestArray() {
        return guestArray;
    }
}
