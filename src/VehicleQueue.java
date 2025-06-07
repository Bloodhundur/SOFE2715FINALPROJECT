import java.util.PriorityQueue;

public class VehicleQueue {
    PriorityQueue<Vehicle> queue = new PriorityQueue<>();

    public void add_vehicle(Vehicle v) {
        queue.add(v);
    }

    public void process_vehicles(CityMap city) {
        while (!queue.isEmpty()) {
            Vehicle v = queue.poll();
            System.out.println("\nProcessing Vehicle ID: " + v.id + " | Type: " + v.type);
            Dijkstra.find_shortest_path(city, v.source, v.destination);
        }
    }
}
