package BellMan;

public class BellmanFordDriver {
	public static void main(String[] args) {

        int totalV = 6; // Number of vertices

        int E = 8; // Number of edges

        GraphBF graph = new GraphBF(totalV, E);




        // Graph with negative weight edges

        graph.addEdge(0, 1, 4);

        graph.addEdge(0, 2, 1);

        graph.addEdge(1, 4, 5);

        graph.addEdge(2, 3, 3);

        graph.addEdge(2, 4, 2);

        graph.addEdge(3, 5, -6);

        graph.addEdge(4, 5, 1);

        graph.addEdge(5, 3, 2); // This can form a negative cycle if weight is -8




        graph.bellmanFord(0); // Find shortest paths from node 0

    }

}


