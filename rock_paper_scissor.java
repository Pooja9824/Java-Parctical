
//import java.util.Scanner;
import java.util.*;

public class rock_paper_scissor {
    public static void main(String[] args) {
        System.out.println("hello! welcome to our game zone of Rock Paper Scissor.\n Let's begin the game.");
        System.out.println("Please choose:-\n 0 for Rock \n 1 for Paper \n 2 for Scissor");

        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        System.out.println("It's your turn,");
        int user_input = sc.nextInt();
        switch (user_input) {
            case 0:
                System.out.println("you selected Rock");
                break;
            case 1:
                System.out.println("you selected Paper");
                break;
            case 2:
                System.out.println("you selected Scissor");
                break;
            default:
                System.out.println("Enter proper value");
                break;
        }

        System.out.println("now! It's computers turm,");
        int com_input = ra.nextInt(2);
        System.out.println(com_input);
        switch (com_input) {
            case 0:
                System.out.println("computer selected Rock");
                break;
            case 1:
                System.out.println("computer selected Paper");
                break;
            case 2:
                System.out.println("computer selected Scissor");
                break;

        }

        if (user_input == com_input) {
            System.out.println("Match Draw!");
        } else if (user_input == 0 & com_input == 2) {
            System.out.println("Congratulations,you won!");
        } else if (user_input == 1 & com_input == 0) {
            System.out.println("Congratulations,you won!");
        } else if (user_input == 2 & com_input == 1) {
            System.out.println("Congratulations,you won!");
        } else {
            System.out.println("you lose!better luck next time");
        }
    }

}
