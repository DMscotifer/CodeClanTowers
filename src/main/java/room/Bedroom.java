package room;

public class Bedroom extends Room {

    private int roomNo;
    private Type type;
    private double rate;

    public Bedroom(int capacity, boolean chargeable, int roomNo, Type type, double rate) {
        super(capacity, chargeable);
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
