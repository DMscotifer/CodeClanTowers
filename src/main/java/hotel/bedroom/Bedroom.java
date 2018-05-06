package hotel.bedroom;

import hotel.Room;

public class Bedroom extends Room {

    private int roomNo;
    private BedroomType type;
    private double rate;

    public Bedroom(int roomNo, BedroomType type, double rate) {
        this.roomNo = roomNo;
        this.type = type;
        this.rate = rate;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public BedroomType getType() {
        return type;
    }

    public void setType(BedroomType type) {
        this.type = type;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
