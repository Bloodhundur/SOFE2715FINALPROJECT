# Smart Traffic Management System

A console based simulation written with princples of OOP in mind for a smart traffic management system designed for dynamic routing and prioritization of vehicles using Dijkstra’s algorithm. This program simulates a road network, accepts real-time vehicle input, and ensures that emergency vehicles are prioritized in the queue.

## Project Structure

- Main.java — Main menu and user interface loop  
- CityMap.java — Graph data structure for intersections and roads  
- Edge.java — Represents roads (edges) between intersections  
- Dijkstra.java — Dijkstra's shortest path implementation  
- Vehicle.java — Vehicle data (ID, type, source, destination)  
- VehicleQueue.java — Priority queue handling vehicle processing  

## Features

- Build a custom city map with intersections and roads  
- Add vehicles with different types (normal or emergency)  
- Simulate vehicle movements with priority-based scheduling  
- Compute the shortest path between intersections using Dijkstra’s algorithm  
- Prioritize emergency vehicles over normal ones  

## How It Works

1. CityMap acts as the graph where intersections are vertices and roads are weighted edges.  
2. VehicleQueue manages incoming vehicles using a priority queue. Emergency vehicles are served first.  
3. Dijkstra algorithm is used to calculate the shortest path between a vehicle’s source and destination.  
4. Users interact through a simple CLI menu to create maps, input vehicles, and simulate traffic.  

## Running the Program

Run:  
`java Main`

Follow the prompts to:  
- Create a city map  
- Add vehicles  
- Run the simulation  

## Example Flow

1. Create a map with 5 intersections and several roads.  
2. Add 3 vehicles (1 emergency, 2 normal).  
3. Run the simulation:  
   - Emergency vehicle is processed first  
   - Shortest paths are calculated and printed  

---

![image](https://github.com/user-attachments/assets/62f53a3a-8e23-4ef3-9562-3684e27ebcab)

![image](https://github.com/user-attachments/assets/80b8c05b-6d29-47aa-8a10-c930bbb10359)

![image](https://github.com/user-attachments/assets/186e980e-2720-4764-b183-ed84a15ec0bc)

![image](https://github.com/user-attachments/assets/0a38f94e-3348-4cec-a95e-4014fd55dfc1)

## Concepts Demonstrated

- Graph theory and shortest path algorithms  
- Object-oriented programming  
- Priority queues and scheduling  
- Java-based CLI application development  

