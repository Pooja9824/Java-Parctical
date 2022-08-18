import java.util.Scanner;

public class elseif_demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ege:- ");
        int i = sc.nextInt();

        if (i < 18) {
            System.out.println("You are not eligible for driving licence because you are so small for that");
        } else if (i >= 18 && i <= 60) {
            System.out.println("You are eligible for driving licence");
        } else if (i > 60) {
            System.out.println("You are not eligible for driving licence because you are so old");
        } else {
            System.out.println("plese enter proper value");
        }
    }
}
