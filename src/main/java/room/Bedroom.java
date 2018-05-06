package room;

public class Bedroom extends Room {

    private int roomNo;
    private BedroomType type;

    public Bedroom(Integer rate, int roomNo, BedroomType type, double rate1) {
        super(rate);
        this.roomNo = roomNo;
        this.type = type;
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

}
