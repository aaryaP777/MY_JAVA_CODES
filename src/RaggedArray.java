public class RaggedArray {
    public static void main(String[] args) {
        int[][] arr1 ={
                {29,5,4},
                {10,7,33,9},
                {62,80}
        };
        System.out.println("Ragged array is: ");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
