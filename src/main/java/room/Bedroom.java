package room;

public class Bedroom extends Room {

    private int roomNo;
    private Type type;
    private double nightlyRate;
    private int bookingLength;

    public Bedroom(int capacity, boolean chargeable, int roomNo, Type type, double nightlyRate) {
        super(capacity, chargeable);
        this.roomNo = roomNo;
        this.type = type;
        this.nightlyRate = nightlyRate;
        this.bookingLength = 0;
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

    public int getBookingLength() {
        return bookingLength;
    }

    public void setBookingLength(int bookingLength) {
        this.bookingLength = bookingLength;
    }
}
