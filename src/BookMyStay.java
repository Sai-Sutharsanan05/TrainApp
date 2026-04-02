import java.util.*;

public class BookMyStay {
    public static void main(String args[]) {
        System.out.println("Add-On Service Selection");
        RoomAllocationService allocationService = new RoomAllocationService();
        AddOnServiceManager serviceManager = new AddOnServiceManager();
        String resId = "Single-1";
        Service breakfast = new Service("Breakfast", 500.0);
        Service spa = new Service("Spa", 1000.0);
        serviceManager.addService(resId, breakfast);
        serviceManager.addService(resId, spa);
        System.out.println("Reservation ID: " + resId);
        double totalCost = serviceManager.calculateTotalServiceCost(resId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}
class Service {
    private String serviceName;
    private double cost;

    public Service(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceName() { return serviceName; }
    public double getCost() { return cost; }
}

class AddOnServiceManager {
    private Map<String, List<Service>> servicesByReservation;

    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    public void addService(String reservationId, Service service) {
        // computeIfAbsent handles the creation of the ArrayList automatically
        servicesByReservation.computeIfAbsent(reservationId, k -> new ArrayList<>()).add(service);
    }

    public double calculateTotalServiceCost(String reservationId) {
        List<Service> services = servicesByReservation.get(reservationId);
        if (services == null) return 0.0;

        double total = 0;
        for (Service s : services) {
            total += s.getCost();
        }
        return total;
    }
}

class RoomAllocationService {
    private Set<String> allocatedRoomIds;
    private Map<String, Set<String>> assignedRoomsByType;

    public RoomAllocationService() {
        allocatedRoomIds = new HashSet<>();
        assignedRoomsByType = new HashMap<>();
    }
}