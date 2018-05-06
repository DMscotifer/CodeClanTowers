package room;

public class Bedroom extends Room {

    private int roomNo;
    private Type type;
    private double nightlyRate;

    public Bedroom(int capacity, boolean chargeable, int roomNo, Type type, double nightlyRate) {
        super(capacity, chargeable);
        this.roomNo = roomNo;
        this.type = type;
        this.nightlyRate = nightlyRate;
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

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(double nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

}
