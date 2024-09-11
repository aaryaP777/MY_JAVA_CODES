public class DAA_QuickSort {
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = low - 1; // no. of empty spaces where elements < pivot element can fit
        for(int j = low; j<high; j++){
            if(arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // to fit pivot in correct position
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
    }
    public static void quickSort(int arr[], int low, int high){
        if(low < high){

            // to get the index of pivot element
            int pivotIndex = partition(arr, low, high);

            // recursive function for left side of pivot
            quickSort(arr, low, pivotIndex-1);

            // recursive function for right side of pivot
            quickSort(arr, pivotIndex+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;

        quickSort(arr, 0, n-1);
        printArr(arr);
    }
}
