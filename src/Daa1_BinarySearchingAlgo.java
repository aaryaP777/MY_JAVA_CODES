import java.util.*;
public class Daa1_BinarySearchingAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Enter length of the array: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        System.out.print("Enter the elements of the array: ");
        for(i=0; i<length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("The array is: ");
        for(i=0; i<length; i++){
            System.out.println(array[i]);
        }

        System.out.print("Enter element to search: ");
        int ele = sc.nextInt();

        int l = 0;
        int h = length - 1;
        int mid = (l+h)/2;

        while(l <= h){
            if(ele == array[mid]){
                System.out.println("Element found!!");
                break;
            }
            else if(ele > array[mid]){
                l = mid + 1;
                mid = (l+h)/2;
            }
            else if(ele < array[mid]){
                h = mid - 1;
                mid = (l+h)/2;
            }
        }
        if(l>h){
            System.out.println("Element not found..Try again");
        }

    }
}
