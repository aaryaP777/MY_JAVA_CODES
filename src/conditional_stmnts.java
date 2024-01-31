import java.util.Scanner;
public class conditional_stmnts {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = num.nextInt();
        if(age > 18){
            System.out.println("OKAY...");
        }
        else if(age==18){
            System.out.println("okay...");
        }
        else{
            System.out.println("NOT OKAY !!!!");
        }


    }
}
