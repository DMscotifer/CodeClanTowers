package room;

public class Conference extends Room {

    private String name;
    private Double dailyRate;

    public Conference(int capacity, boolean chargeable, String name, double dailyRate) {
        super(capacity, chargeable);
        this.name = name;
        this.dailyRate = dailyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(Double dailyRate) {
        this.dailyRate = dailyRate;
    }
}
