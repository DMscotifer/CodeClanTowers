package room;

public enum Type {

    SINGLE(1),
    DOUBLE(2);

    private int capacity;

    Type(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
