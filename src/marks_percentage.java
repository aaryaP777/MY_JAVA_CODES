import java.util.Scanner;
public class marks_percentage {

    public static void main(String[] args){
        Scanner mks = new Scanner(System.in);
        System.out.print("Enter total marks: ");
        float total_marks = mks.nextInt();
        System.out.print("SUB-1: ");
        float a = mks.nextInt();
        System.out.print("SUB-2: ");
        float b = mks.nextInt();
        System.out.print("SUB-3: ");
        float c = mks.nextInt();

        float avg = (a + b + c)/total_marks;
        float percentage = avg * 100;
        System.out.print("Percentage is: ");
        System.out.println(percentage);




    }
}
