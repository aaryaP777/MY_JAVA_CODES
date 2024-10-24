import java.util.PriorityQueue;

public class optimalMerge {

    public static int optimalMergeCost(int[] files) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all files to the priority queue
        for (int size : files) {
            minHeap.add(size);
        }

        int totalCost = 0;

        // While more than one file is left to merge
        while (minHeap.size() > 1) {
            int file1 = minHeap.poll();  //  smallest file
            int file2 = minHeap.poll();  // next smallest file
            int mergeCost = file1 + file2;
            totalCost += mergeCost;
            minHeap.add(mergeCost);  // Add the merged file back to the queue
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] files = {5, 10, 15, 20, 25};
        int cost = optimalMergeCost(files);
        System.out.println("Total cost of merging files: " + cost);
    }
}

