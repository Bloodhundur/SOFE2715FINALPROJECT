public class Vehicle implements Comparable<Vehicle> {
    String type;
    int id;
    int source;
    int destination;

    public Vehicle(int id, String type, int source, int destination) {
        this.id = id;
        this.type = type;
        this.source = source;
        this.destination = destination;
    }

    @Override
    public int compareTo(Vehicle v) {
        // Emergency vehicles first
        if (this.type.equals("emergency") && v.type.equals("normal")) return -1;
        if (this.type.equals("normal") && v.type.equals("emergency")) return 1;
        return 0;
    }
}
