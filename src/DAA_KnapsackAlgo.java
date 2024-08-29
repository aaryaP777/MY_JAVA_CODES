
public class DAA_KnapsackAlgo {
    static int knapsack(int W, int wt[], int val[], int n){
        if(n==0 || W==0)
            return 0;

        if(wt[n-1] > W)
            return knapsack(W, wt, val,n-1);

        else
            return Math.max(knapsack(W, wt, val,n-1), val[n-1] + knapsack(W - wt[n-1], wt, val, n-1));
    }

    public static void main(String[] args) {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapsack(W, weight, profit, n));
    }
}
