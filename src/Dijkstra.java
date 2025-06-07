import java.util.*;

public class Dijkstra {
    public static void find_shortest_path(CityMap city, int start, int end) {
        int[] dist = new int[city.vertices];
        boolean[] visited = new boolean[city.vertices]; // prevents reprocessing same intersection
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{start, 0}); // start point

        while (!pq.isEmpty()) {
            int[] current = pq.poll(); 
            int u = current[0];
            if (visited[u]) continue; // if intersection true then doesn't process
            visited[u] = true;

            for (Edge e : city.adj_list.get(u)) {
                if (!visited[e.dest] && dist[u] + e.weight < dist[e.dest]) {
                    // conditional that checks if it has been visited and if it's smaller than the current smallest path
                    dist[e.dest] = dist[u] + e.weight;
                    pq.add(new int[]{e.dest, dist[e.dest]});
                    // add back so we can reprocess it
                }
            }
        }

        System.out.println("Shortest path from Intersection " + start + " to Intersection " + end + " is: " + dist[end]);
    }
}
