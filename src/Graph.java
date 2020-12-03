import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Graph {

      final Map<Vertex, List<Vertex>> adjVertices;

    // standard constructor, getters, setters


          public Graph() {
        adjVertices = new HashMap<>();
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("Бог1");

        System.out.println(graph);


    }

    void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

    @Override
    public String toString() {
        StringBuilder map = new StringBuilder();
        for (Map.Entry<Vertex, List<Vertex>> entry : adjVertices.entrySet()) {
            map.append(entry.getKey() + ":" + entry.getValue());
        }
        return "Graph{" +
                "adjVertices=" + map +
                '}';


    }
}