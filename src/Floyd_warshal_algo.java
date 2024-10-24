import java.io.*;
import java.lang.*;
import java.util.*;
public class Floyd_warshal_algo {
    final static int INF = 99999, V = 4; // infinity value and no. of vertices

    void Floyd_Warshal(int dist[][]){                 // to implement algorithm
        int i, j, k;

        for(k=0; k<V; k++){                           //intermediate vertex
            for(i=0; i<V; i++){                       // source vertex
                for(j=0; j<V; j++){                   // destination vertex
                    if(dist[i][k] + dist[k][j] < dist[i][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        printSol(dist);
    }
    void printSol(int dist[][]){
        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                if(dist[i][j] == INF){
                    System.out.print("∞ ");
                }
                else{
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int graph[][] = { { 0, 5, INF, 10 },
                          { INF, 0, 3, INF },
                          { INF, 4, 0, 1 },
                          { 15, INF, 6, 0 } };

        Floyd_warshal_algo f = new Floyd_warshal_algo();
        f.Floyd_Warshal(graph);
    }
}
