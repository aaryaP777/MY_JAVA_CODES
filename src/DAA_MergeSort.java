public class DAA_MergeSort {
    public static void conquer(int arr[], int start, int mid, int end){
        int merged[] = new int[end - start + 1];

        int start2 = start; // for first array
        int end2 = mid+1; // for second array
        int mergedIndex = 0; // for merged array

        while(start2 <= mid && end2<= end){
            if(arr[start2] <= arr[end2]){
                merged[mergedIndex] = arr[start2];
                mergedIndex ++;
                start2 ++;
            }
            else{
                merged[mergedIndex] = arr[end2];
                mergedIndex ++;
                end2++;
            }
        }

        while(start2 <= mid){
            merged[mergedIndex] = arr[start2];
            mergedIndex ++;
            start2++;
        }

        while(end2 <= end){
            merged[mergedIndex] = arr[end2];
            mergedIndex ++;
            end2++;
        }

        for(int i=0; i<merged.length; i++){
            arr[start + i] = merged[i];
        }

    }
    public static void divide(int arr[], int start, int end){

        if(start >= end){
            return ;
        }

        int mid = (start + end)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);

        conquer(arr, start, mid, end);

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
