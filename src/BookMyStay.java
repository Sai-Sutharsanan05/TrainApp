import java.util.*;
public class BookMyStay {
    public static void main(String args[]) {
        System.out.println("Booking History and Reporting");
        BookingHistory history = new BookingHistory();
        BookingReportService reportService = new BookingReportService();
        history.addReservation(new Reservation("Abhi", "Single"));
        history.addReservation(new Reservation("Subha", "Double"));
        history.addReservation(new Reservation("Vanmathi", "Suite"));
        reportService.generateReport(history);
    }
}
class BookingHistory {
    private List<Reservation> confirmedReservations;
    public BookingHistory() {
        confirmedReservations = new ArrayList<>();
    }
    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }
    public List<Reservation> getConfirmedReservations() {
        return confirmedReservations;
    }
}
class BookingReportService {
    public void generateReport(BookingHistory history) {
        System.out.println("Booking History Report");
        List<Reservation> records = history.getConfirmedReservations();
        for (Reservation res : records) {
            System.out.println("Guest: " + res.getGuestName() +
                    ", Room Type: " + res.getRoomType());
        }
    }
}
class Reservation {
    private String guestName;
    private String roomType;
    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }
    public String getGuestName() { return guestName; }
    public String getRoomType() { return roomType; }
}