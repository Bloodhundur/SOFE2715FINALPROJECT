import java.util.*;

public class CityMap {
    int vertices;
    List<List<Edge>> adj_list;

    public CityMap(int vertices) {
        this.vertices = vertices;
        adj_list = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj_list.add(new ArrayList<>());
        }
    }

    public void add_street(int src, int dest, int weight) {
        adj_list.get(src).add(new Edge(dest, weight));
        adj_list.get(dest).add(new Edge(src, weight));
    }

    
    public void display_city() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Intersection " + i + " connects to: ");
            for (Edge edge : adj_list.get(i)) {
                System.out.print("[Intersection " + edge.dest + " | Distance: " + edge.weight + "] ");
            }
            System.out.println();
        }
    }
}
