import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class EventPlanner {
    public static void main(String[] args) {
        System.out.println("Course: Java Advanced");
        System.out.println("Assignment: Project 3: Demonstrate OOP principles for inheritance");
        System.out.println("Date: " + LocalDate.now());
        System.out.println("Student: Mason Pond");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of events to create:");
        int numEvents = scanner.nextInt();
        Event[] events = new Event[numEvents];

        for (int i = 0; i < numEvents; i++) {
            System.out.println("Creating Event #" + (i + 1));
            System.out.println("Choose event type (1. Event, 2. BirthdayParty, 3. Quinceanera):");
            int eventType = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (eventType) {
                case 1:
                    events[i] = createEvent(scanner);
                    break;
                case 2:
                    events[i] = createBirthdayParty(scanner);
                    break;
                case 3:
                    events[i] = createQuinceanera(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to general event.");
                    events[i] = createEvent(scanner);
            }
        }

        System.out.println("\nEvent Planning Report:");
        for (Event event : events) {
            System.out.println(event.toString());
        }
    }

    private static Event createEvent(Scanner scanner) {
        System.out.println("Enter date (YYYY-MM-DD):");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        System.out.println("Enter start time (HH:MM):");
        LocalTime startTime = LocalTime.parse(scanner.nextLine());

        System.out.println("Enter end time (HH:MM):");
        LocalTime endTime = LocalTime.parse(scanner.nextLine());

        System.out.println("Enter location name:");
        String locationName = scanner.nextLine();

        System.out.println("Enter location address:");
        String locationAddress = scanner.nextLine();

        System.out.println("Enter event name:");
        String eventName = scanner.nextLine();

        System.out.println("Enter number of guests:");
        int numberOfGuests = scanner.nextInt();

        System.out.println("Enter point of contact:");
        scanner.nextLine(); // Consume newline
        String pointOfContact = scanner.nextLine();

        System.out.println("Enter price:");
        double price = scanner.nextDouble();

        return new Event(date, startTime, endTime, locationName, locationAddress, eventName, numberOfGuests,
                pointOfContact, price);
    }

    private static BirthdayParty createBirthdayParty(Scanner scanner) {
        Event event = createEvent(scanner); // Create basic event first

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Enter cake:");
        scanner.nextLine(); // Consume newline
        String cake = scanner.nextLine();

        System.out.println("Enter number of candles:");
        int candles = scanner.nextInt();

        System.out.println("Enter decorations:");
        scanner.nextLine(); // Consume newline
        String decorations = scanner.nextLine();

        return new BirthdayParty(event.getDate(), event.getStartTime(), event.getEndTime(),
                event.getLocationName(), event.getLocationAddress(), event.getEventName(),
                event.getNumberOfGuests(), event.getPointOfContact(), event.getPrice(),
                age, cake, candles, decorations);
    }

      private static Quinceanera createQuinceanera(Scanner scanner) {
        BirthdayParty birthdayParty = createBirthdayParty(scanner); // Create birthday party first

        System.out.println("Enter number of damas:");
        int numberOfDamns = scanner.nextInt();

        System.out.println("Enter number of toasts:");
        int numberOfToasts = scanner.nextInt();

        System.out.println("Enter dance music:");
        scanner.nextLine(); // Consume newline
        String danceMusic = scanner.nextLine();

        return new Quinceanera(birthdayParty.getDate(), birthdayParty.getStartTime(), birthdayParty.getEndTime(),
                birthdayParty.getLocationName(), birthdayParty.getLocationAddress(), birthdayParty.getEventName(),
                birthdayParty.getNumberOfGuests(), birthdayParty.getPointOfContact(), birthdayParty.getPrice(),
                numberOfDamns, numberOfToasts, danceMusic);
    }
}
