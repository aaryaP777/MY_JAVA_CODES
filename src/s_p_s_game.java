import java.util.Random;
import java.util.Scanner;
public class s_p_s_game {
    public static void main(String[] args){
        int num_user, num_comp;
//        int score = 0;
//        int round = 1;
        Random num = new Random();
        Scanner sc = new Scanner(System.in);
        num_comp = num.nextInt(0, 4);
        System.out.println("Stone--Paper--Scissors Game..");
        System.out.println("1 -> Scissors \n2 -> Paper \n3 -> Stone");
        System.out.print("Enter your choice: ");
        num_user = sc.nextInt();
            if ((num_user == 1 && num_comp == 3) || (num_user == 2 && num_comp == 1) || (num_user == 3 && num_comp == 2)) {
                System.out.println("Sorry you lost...Try again :( ");
            }
            if ((num_user == 1 && num_comp == 2) || (num_user == 2 && num_comp == 3) || (num_user == 3 && num_comp == 1)) {
                System.out.println("Cheers!! You won!! ;) ");
            }
            else {
                System.out.println("It's a draw... :| ");
            }
    }
}
