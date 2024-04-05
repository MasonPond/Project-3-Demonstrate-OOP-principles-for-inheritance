import java.time.LocalDate;
import java.time.LocalTime;

public class BirthdayParty extends Event {
    private int age;
    private String cake;
    private int candles;
    private String decorations;

    // Constructor
    public BirthdayParty(LocalDate date, LocalTime startTime, LocalTime endTime,
                         String locationName, String locationAddress, String eventName,
                         int numberOfGuests, String pointOfContact, double price,
                         int age, String cake, int candles, String decorations) {
        super(date, startTime, endTime, locationName, locationAddress, eventName,
                numberOfGuests, pointOfContact, price);
        this.age = age;
        this.cake = cake;
        this.candles = candles;
        this.decorations = decorations;
    }

    // Getters and Setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCake() {
        return cake;
    }

    public void setCake(String cake) {
        this.cake = cake;
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public String getDecorations() {
        return decorations;
    }

    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }

    @Override
    public String toString() {
        return "BirthdayParty{" +
                "age=" + age +
                ", cake='" + cake + '\'' +
                ", candles=" + candles +
                ", decorations='" + decorations + '\'' +
                "} " + super.toString();
    }
}
