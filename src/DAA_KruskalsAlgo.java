import java.util.ArrayList;
import java.util.Collections;

class Edge implements Comparable<Edge>{
    int src, destination, wt;

    Edge(int src, int destination, int wt){
        this.src = src;
        this.destination = destination;
        this.wt = wt;
    }

    public int compareTo(Edge that){
        return this.wt - that.wt;
    }
}
public class DAA_KruskalsAlgo{

    // union find method
    static int p[], rank[];
    static void union(int x, int y){
        int rx = find(x);
        int ry = find(y);
        if(rx == ry) return;
        p[ry] = rx;
    }
    static int find(int x){
        if(p[x] == x) return x;
        return find(p[x]);
    }

    // func to find weights and edges of MST
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean added[][] = new boolean[V][V];
        ArrayList<Edge> edges = new ArrayList<>();

        for(int i=0; i<adj.size(); i++){
            for(int j=0; j<adj.get(i).size(); j++){
                ArrayList<Integer> cur = adj.get(i).get(j);
                if(!added[i][cur.get(0)]){
                    added[i][cur.get(0)] = true;
                    added[cur.get(0)][i] = true;
                    edges.add(new Edge(i, cur.get(0), cur.get(1)));
                }
            }
        }
        p = new int[V];
        for(int i=0; i<V; i++){
            p[i] = i;
        }

        Collections.sort(edges);
        int count = 1;
        int ans = 0;

        for(int i = 0; count<V; i++){
            Edge edge = edges.get(i);
            int rx = find(edge.src);
            int ry = find(edge.destination);

            if(rx != ry){
                union(rx, ry);
                count ++;
                ans += edge.wt;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices

        // Graph representation using adjacency list
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<ArrayList<Integer>>());
        }
        adj.get(0).add(new ArrayList<Integer>(){{add(1); add(2);}});
        adj.get(1).add(new ArrayList<Integer>(){{add(0); add(2);}});

        adj.get(0).add(new ArrayList<Integer>(){{add(3); add(6);}});
        adj.get(3).add(new ArrayList<Integer>(){{add(0); add(6);}});

        adj.get(1).add(new ArrayList<Integer>(){{add(2); add(3);}});
        adj.get(2).add(new ArrayList<Integer>(){{add(1); add(3);}});

        adj.get(1).add(new ArrayList<Integer>(){{add(3); add(8);}});
        adj.get(3).add(new ArrayList<Integer>(){{add(1); add(8);}});

        adj.get(1).add(new ArrayList<Integer>(){{add(4); add(5);}});
        adj.get(4).add(new ArrayList<Integer>(){{add(1); add(5);}});

        adj.get(2).add(new ArrayList<Integer>(){{add(4); add(7);}});
        adj.get(4).add(new ArrayList<Integer>(){{add(2); add(7);}});

        adj.get(3).add(new ArrayList<Integer>(){{add(4); add(9);}});
        adj.get(4).add(new ArrayList<Integer>(){{add(3); add(9);}});

        // Calculate the MST weight
        int mstWeight = spanningTree(V, adj);
        System.out.println("The weight of the Minimum Spanning Tree is: " + mstWeight);
    }
}