public class ArrayExample1 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int []array2 = new int[10];
        int[] array3 = {1,2,3,4};
        int[] array4 = new int[100];

//        System.out.println(array3[2]);
//
//        System.out.print("array 3: ");
//        for(int i = 0; i < array3.length; i++){
//            System.out.print(array3[i]);
//            array2[i] = array3[i];
//        }
//        System.out.println();

//        System.out.println("For Each Loop");
//        for(int a : array2){
//            System.out.println(a);
//        }
//
//        System.out.print("Reverse array is: ");
//        for(int i = (array3.length - 1); i >= 0; i--){
//            System.out.print( array3[i] );
//        }
//        System.out.println();
//
//        System.out.print("Alternate elements: ");
//        for(int i = 0; i < array3.length; i = i+2){
//            System.out.print(array3[i]);
//        }

        System.out.println("Even numbers from 0-100");
        for(int j = 0; j<=100; j++){
            if(j % 2 == 0){
                for(int i = 0; i < array4.length; i++) {
                    array4[i] = j;
                }
            }
        }

        System.out.print("Largest element of {1,2,3,4}: ");
        int l = array3[0];
        for(int a = 0; a < array3.length; a++){
            if(array3[a] > l){
                l = array3[a];
            }
        }
        System.out.println(l);
    }
}
