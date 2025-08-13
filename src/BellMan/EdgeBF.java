package BellMan;


	import java.util.List;

	import java.util.ArrayList;

	import java.util.Arrays;
	public class EdgeBF {




	

	    int src, dest, weight;

	    EdgeBF(int src, int dest, int weight) {

	        this.src = src;

	        this.dest = dest;

	        this.weight = weight;

	    }

	}




	class GraphBF {

	    int totalV, E;

	    List<EdgeBF> edges;




	    GraphBF(int totalV, int E) {

	        this.totalV = totalV;

	        this.E = E;

	        edges = new ArrayList<>();

	    }




	    void addEdge(int src, int dest, int weight) {

	        edges.add(new EdgeBF(src, dest, weight));

	    }




	    void bellmanFord(int src) {

	        int[] dist = new int[totalV];

	        Arrays.fill(dist, Integer.MAX_VALUE);

	        dist[src] = 0;




	        // Relax all edges V-1 times

	        for (int i = 1; i < totalV; i++) {

	            for (EdgeBF edge : edges) {

	                if (dist[edge.src] != Integer.MAX_VALUE && dist[edge.src] + edge.weight < dist[edge.dest]) {

	                    dist[edge.dest] = dist[edge.src] + edge.weight;

	                }

	            }

	        }




	        // Detect negative weight cycles

	        for (EdgeBF edge : edges) {

	            if (dist[edge.src] != Integer.MAX_VALUE && dist[edge.src] + edge.weight < dist[edge.dest]) {

	                System.out.println("Graph contains a negative weight cycle!");

	                return;

	            }

	        }




	        // Print shortest path distances

	        System.out.println("Shortest distances from source " + src + ":");

	        for (int i = 0; i < totalV; i++) {

	            System.out.println("To node " + i + " → Distance: " + (dist[i] == Integer.MAX_VALUE ? "∞" : dist[i]));

	        }

	    }

	}




	
