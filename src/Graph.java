import java.util.*;

public class Graph {
    private int Vertices;
    private List<List<Integer>> adj;
    private boolean isDirectedGraph;

    //constructor
    public Graph(int Vertices, boolean isDirectedGraph) {
        this.Vertices = Vertices;
        this.isDirectedGraph = isDirectedGraph;
        adj = new ArrayList<>(Vertices);
        for (int i = 0; i < Vertices; i++) {
            adj.add(new LinkedList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adj.get(source).add(destination);
        if (!isDirectedGraph) {
            adj.get(destination).add(source); //add the edge back in the other direction
        }
    }



}