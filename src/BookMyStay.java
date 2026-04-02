import java.util.LinkedList;
import java.util.Queue;

/**
 * Primary Class: BookMyStayApp (Use Case 5)
 * Version: 5.0 - Booking Request Queue (FIFO)
 */
public class BookMyStay{
    public static void main(String args[]) {
        System.out.println("Welcome to BookMyStayApp");
        System.out.println("Version: 5.0 - Booking Request Queue\n");

        BookingRequestQueue requestQueue = new BookingRequestQueue();

        // Adding requests (Kishore -> Arun -> Divya)
        requestQueue.addRequest(new Reservation("Kishore", "Single"));
        requestQueue.addRequest(new Reservation("Arun", "Suite"));
        requestQueue.addRequest(new Reservation("Divya", "Double"));

        // Displaying the queue to confirm FIFO order
        requestQueue.displayQueue();

        System.out.println("\nNo allocation done yet.");
    }
}

class Reservation {
    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Guest: " + guestName + ", Requested Room: " + roomType;
    }
}

class BookingRequestQueue {
    private Queue<Reservation> queue = new LinkedList<>();

    public void addRequest(Reservation reservation) {
        queue.offer(reservation);
        System.out.println("Request added: " + reservation);
    }

    public void displayQueue() {
        System.out.println("\nCurrent Booking Queue (FIFO Order):");
        for (Reservation r : queue) {
            System.out.println(r);
        }
    }
}