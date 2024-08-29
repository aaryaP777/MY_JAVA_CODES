import java.util.*;
import java.io.*;
import java.lang.*;
class Graph {
    private int V;
    private List<int[]>[] adj;
    class iPair implements Comparable<iPair>{
        int vertex, weight;
        iPair(int v, int w){
            vertex = v;
            weight = w;
        }
        public int compareTo(iPair other){
            return Integer.compare(this.weight, other.weight);
        }
    }

    Graph(int V){
        this.V = V;
        adj = new ArrayList[V];
        for(int i=0; i<V; ++i)
            adj[i] = new ArrayList<>();
    }

    void addEdge(int u, int v, int w){
        adj[u].add(new int[] {v, w});
        adj[v].add(new int[] {u, w});
    }

    void shortestPath(int src){
        PriorityQueue<iPair> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        pq.add(new iPair(src, 0));
        dist[src] = 0;

        while(!pq.isEmpty()){
            int u = pq.poll().vertex;

            for(int[] neighbor: adj[u]){
                int v = neighbor[0];
                int weight = neighbor[1];

                if(dist[v]>dist[u] + weight){
                    dist[v] = dist[u] + weight;
                    pq.add(new iPair(v, dist[v]));
                }
            }
        }
        System.out.println("Vertex distance from source");
        for(int i=0; i<V; ++i)
            System.out.println(i + "\t\t" + dist[i]);
    }
}

public class DAA_DijkstrasAlgo{
    public static void main(String[] args) {
        int V = 9;
        Graph g = new Graph(V);

        g.addEdge(0, 1, 4);
        g.addEdge(0, 7, 8);
        g.addEdge(1, 2, 8);
        g.addEdge(1, 7, 11);
        g.addEdge(2, 3, 7);
        g.addEdge(2, 8, 2);
        g.addEdge(2, 5, 4);
        g.addEdge(3, 4, 9);
        g.addEdge(3, 5, 14);
        g.addEdge(4, 5, 10);
        g.addEdge(5, 6, 2);
        g.addEdge(6, 7, 1);
        g.addEdge(6, 8, 6);
        g.addEdge(7, 8, 7);

        g.shortestPath(0);
    }
}
