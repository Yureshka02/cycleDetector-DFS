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
    public boolean depthFirstSearch(int node, boolean[] visited,int parent, boolean[] recusiveStack) {
        visited[node] = true;

        if(isDirectedGraph){
            recusiveStack[node] = true;
        }

        for (int neighbour : adj.get(node)) {
            // for directed graph ,checking if the neighbour is already visited and is in the recusive stack
            if (isDirectedGraph && recusiveStack[neighbour]) {
                System.out.println("Cycle detected at edge: "+ node + " - " + neighbour);
                return true;
            }
            // for undirected graph, checking if the neighbour is already visited
            if (!visited[neighbour]) {
                if (depthFirstSearch(neighbour, visited, node, recusiveStack)) {
                    return true;
                }
            }
            // for undirected graph, checking if the neighbour is not the parent of the current node
            else if(neighbour != parent) {
                System.out.println("Cycle detected at edge: " + node + " - " + neighbour);
                return true;
            }

        }
        // for directed graph, removing the node from the recusive stack
        if(isDirectedGraph){
            recusiveStack[node] = false;
        }
        return false;
    }
    //function for cycle detection
    public boolean detectCycle() {
        boolean[] visited = new boolean[Vertices];
        boolean[] recusiveStack = new boolean[Vertices]; //for directed graph
        for (int i = 0; i < Vertices; i++) {
            if (!visited[i]) {
                if (depthFirstSearch(i, visited, -1, recusiveStack)) {
                    return true; //cycle detected
                }
            }
        }
        System.out.println("No cycle detected");
        return false; //no cycle detected

    }
    }