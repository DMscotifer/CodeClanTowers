package room;

public enum BedroomType {

    SINGLE(1),
    DOUBLE(2);

    private int capacity;

    BedroomTypeType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
