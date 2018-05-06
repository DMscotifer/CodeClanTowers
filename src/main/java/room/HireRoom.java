package room;

public class HireRoom extends Room {

    private String name;

    public HireRoom(int capacity, boolean chargeable, String name) {
        super(capacity, chargeable);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
