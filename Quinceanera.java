import java.time.LocalDate;
import java.time.LocalTime;

public class Quinceanera extends BirthdayParty {
    private static final int DEFAULT_AGE = 15;
    private int numberOfDamns;
    private int numberOfToasts;
    private String danceMusic;

    // Constructor
    public Quinceanera(LocalDate date, LocalTime startTime, LocalTime endTime,
                       String locationName, String locationAddress, String eventName,
                       int numberOfGuests, String pointOfContact, double price,
                       int numberOfDamns, int numberOfToasts, String danceMusic) {
        super(date, startTime, endTime, locationName, locationAddress, eventName,
                numberOfGuests, pointOfContact, price,
                DEFAULT_AGE, "Quinceanera Cake", 15, "Quinceanera Decorations");
        this.numberOfDamns = numberOfDamns;
        this.numberOfToasts = numberOfToasts;
        this.danceMusic = danceMusic;
    }

    // Getters and Setters

    public int getNumberOfDamns() {
        return numberOfDamns;
    }

    public void setNumberOfDamns(int numberOfDamns) {
        this.numberOfDamns = numberOfDamns;
    }

    public int getNumberOfToasts() {
        return numberOfToasts;
    }

    public void setNumberOfToasts(int numberOfToasts) {
        this.numberOfToasts = numberOfToasts;
    }

    public String getDanceMusic() {
        return danceMusic;
    }

    public void setDanceMusic(String danceMusic) {
        this.danceMusic = danceMusic;
    }

    @Override
    public String toString() {
        return "Quinceanera{" +
                "numberOfDamns=" + numberOfDamns +
                ", numberOfToasts=" + numberOfToasts +
                ", danceMusic='" + danceMusic + '\'' +
                "} " + super.toString();
    }
}
