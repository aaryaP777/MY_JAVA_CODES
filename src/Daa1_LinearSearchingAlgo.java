import java.util.*;
public class Daa1_LinearSearchingAlgo {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);

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

        System.out.print("Enter the element to search: ");
        int ele = sc.nextInt();

        boolean found = false;
        for(i=0; i<length; i++) {
            if (array[i] == ele) {
                System.out.println("Element found!!");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found...Try again");
        }

    }
}

