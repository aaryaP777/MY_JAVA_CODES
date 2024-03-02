import java.util.Scanner;

public class LinearSearch {
    public static int linsearch(int[] a, int n, int m) {
        for (int i = 0; i < n; i++) {
            if (a[i] == m) {
                return 1;
            } else if (a[i] == n) {
                return 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements of array:");
        int n1 = scanner.nextInt();
        int[] arr = new int[n1];
        System.out.println("Enter elements:");
        for (int x = 0; x < n1; x++) {
            arr[x] = scanner.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int m1 = scanner.nextInt();
        int result = linsearch(arr, n1, m1);
        if (result == 1) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}

