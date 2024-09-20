public class Main {
    public static void main(String[] args) {
        // Directed Graph Example
        System.out.println("Directed Graph:");
        Graph directedGraph = new Graph(4, true); // Creating a directed graph
        directedGraph.addEdge(0, 1);
        directedGraph.addEdge(1, 2);
        directedGraph.addEdge(2, 0); // This forms a cycle
        directedGraph.addEdge(2, 3);
        directedGraph.detectCycle(); // Should detect a cycle

        Graph directedGraph2 = new Graph(4, true);
        directedGraph2.addEdge(0, 1);
        directedGraph2.addEdge(1, 2);
        directedGraph2.addEdge(2, 3);
        directedGraph2.detectCycle(); // Should not detect a cycle


    }
}
