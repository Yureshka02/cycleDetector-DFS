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

        // Undirected Graph Example
        System.out.println("\nUndirected Graph:");
        Graph undirectedGraph = new Graph(5, false); // Creating an undirected graph
        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(1, 2);
        undirectedGraph.addEdge(2, 0); // This forms a cycle
        undirectedGraph.addEdge(1, 3);
        undirectedGraph.addEdge(3, 4);
        undirectedGraph.detectCycle(); // Should detect a cycle

        Graph undirectedGraph2 = new Graph(5, false);
        undirectedGraph2.addEdge(0, 1);
        undirectedGraph2.addEdge(1, 2);
        undirectedGraph2.addEdge(1, 3);
        undirectedGraph2.addEdge(3, 4);
        undirectedGraph2.detectCycle(); // Should not detect a cycle
    }
}
