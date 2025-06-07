import java.util.Scanner;

public class Main {
    private Scanner scanner; 
    private VehicleQueue vq;
    private CityMap city;

    // Constructor
    Main() {
        scanner = new Scanner(System.in);
        vq = new VehicleQueue();
    }

    public static void main(String[] args) {
        System.out.print("Welcome to City Traffic Simulator");
        Main program = new Main();
        program.menu();
    }

    public void menu() {
        System.out.println("\nMENU");
        System.out.println("Type MAP for citymap generation");
        System.out.println("Type VEHICLE for vehicle management");
        System.out.println("Type SIMULATE to run scenario");
        String input = scanner.nextLine();

        if (input.equals("MAP")) {
            System.out.print("Enter number of intersections: ");
            int num_intersections = scanner.nextInt();
            city = new CityMap(num_intersections);

            System.out.print("Enter number of roads: ");
            int num_roads = scanner.nextInt();
            for (int i = 0; i < num_roads; i++) {
                System.out.println("Enter details for road " + (i + 1) + ":");
                System.out.print("Start intersection (0 to " + (num_intersections - 1) + "): ");
                int src = scanner.nextInt();
                System.out.print("End intersection (0 to " + (num_intersections - 1) + "): ");
                int dest = scanner.nextInt();
                System.out.print("Distance: ");
                int weight = scanner.nextInt();
                city.add_street(src, dest, weight);
            }

            System.out.println("\nGenerated City Map:");
            city.display_city();
            menu();
        } else if (input.equals("VEHICLE")) {
            System.out.print("\nEnter number of vehicles: ");
            int num_vehicles = scanner.nextInt();

            for (int i = 0; i < num_vehicles; i++) {
                System.out.println("Vehicle " + (i + 1) + ":");
                System.out.print("Vehicle ID: ");
                int id = scanner.nextInt();
                System.out.print("Type (normal/emergency): ");
                String type = scanner.next();
                System.out.print("Start intersection: ");
                int src = scanner.nextInt();
                System.out.print("Destination intersection: ");
                int dest = scanner.nextInt();
                vq.add_vehicle(new Vehicle(id, type, src, dest));
            }
            menu();
        } else if (input.equals("SIMULATE")) {
            System.out.println("\nProcessing Simulation...");
            vq.process_vehicles(city);
            menu();
        } else {
            System.out.println("Invalid option, please try again");
            menu();
        }
    }
}
