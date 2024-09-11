import java.util.ArrayList;
import java.util.PriorityQueue;
class Pair implements Comparable<Pair>{
    int wt;
    int v;
    Pair(int v, int wt){
        this.v = v;
        this.wt = wt;
    }
    public int compareTo(Pair that){
        return this.wt- that.wt;
    }
}
public class DAA_PrimsAlgo{
    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean[] vis = new boolean[v];
        PriorityQueue<Pair> q = new PriorityQueue<Pair>();

        q.add(new Pair(0,0));
        int ans = 0;
        while(q.size() != 0){
            Pair cur = q.remove();

            int u = cur.v;
            if(vis[u]){
                continue;
            }
            ans+=cur.wt;
            vis[u]=true;

            ArrayList<ArrayList<Integer>> neighbors = adj.get(u);

            for(ArrayList<Integer> list: neighbors){
                int vertex = list.get(0);
                int wt = list.get(1);
                if(vis[vertex] == false){
                    q.add(new Pair(vertex, wt));
                }
            }
        }
    return ans;
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices

        // Initialize the adjacency list for the graph
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        // Add edges to the adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<ArrayList<Integer>>());
        }

        // Example graph: undirected graph
        // Edge 0-1 with weight 2
        adj.get(0).add(new ArrayList<Integer>(){{add(1); add(2);}});
        adj.get(1).add(new ArrayList<Integer>(){{add(0); add(2);}});

        // Edge 0-3 with weight 6
        adj.get(0).add(new ArrayList<Integer>(){{add(3); add(6);}});
        adj.get(3).add(new ArrayList<Integer>(){{add(0); add(6);}});

        // Edge 1-2 with weight 3
        adj.get(1).add(new ArrayList<Integer>(){{add(2); add(3);}});
        adj.get(2).add(new ArrayList<Integer>(){{add(1); add(3);}});

        // Edge 1-3 with weight 8
        adj.get(1).add(new ArrayList<Integer>(){{add(3); add(8);}});
        adj.get(3).add(new ArrayList<Integer>(){{add(1); add(8);}});

        // Edge 1-4 with weight 5
        adj.get(1).add(new ArrayList<Integer>(){{add(4); add(5);}});
        adj.get(4).add(new ArrayList<Integer>(){{add(1); add(5);}});

        // Edge 2-4 with weight 7
        adj.get(2).add(new ArrayList<Integer>(){{add(4); add(7);}});
        adj.get(4).add(new ArrayList<Integer>(){{add(2); add(7);}});

        // Edge 3-4 with weight 9
        adj.get(3).add(new ArrayList<Integer>(){{add(4); add(9);}});
        adj.get(4).add(new ArrayList<Integer>(){{add(3); add(9);}});

        // Call the spanningTree function
        int mstWeight = spanningTree(V, adj);
        System.out.println("The weight of the Minimum Spanning Tree is: " + mstWeight);
    }
}