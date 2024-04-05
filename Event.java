import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String locationName;
    private String locationAddress;
    private String eventName;
    private int numberOfGuests;
    private String pointOfContact;
    private double price;

    // Constructor
    public Event(LocalDate date, LocalTime startTime, LocalTime endTime, String locationName,
                 String locationAddress, String eventName, int numberOfGuests,
                 String pointOfContact, double price) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.locationName = locationName;
        this.locationAddress = locationAddress;
        this.eventName = eventName;
        this.numberOfGuests = numberOfGuests;
        this.pointOfContact = pointOfContact;
        this.price = price;
    }

    // Getters and Setters

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public String getPointOfContact() {
        return pointOfContact;
    }

    public void setPointOfContact(String pointOfContact) {
        this.pointOfContact = pointOfContact;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date=" + date +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", locationName='" + locationName + '\'' +
                ", locationAddress='" + locationAddress + '\'' +
                ", eventName='" + eventName + '\'' +
                ", numberOfGuests=" + numberOfGuests +
                ", pointOfContact='" + pointOfContact + '\'' +
                ", price=" + price +
                '}';
    }
}
