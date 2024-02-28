public class Exception_1 {
    public static void main(String[] args) {
        int []arrayA = new int[2];
        arrayA[0] = 1;
        arrayA[1] = 2;

        try{
            //System.out.println(arrayA[3]);
            int i = 50;
            int c = i/0;
            System.out.println(c);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occurred: ");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException Occurred");
        }
        catch(Exception e){
            System.out.println("Exception Occurred");
        }
        finally{
            System.out.println("Finally Block");
        }
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
    }
}
