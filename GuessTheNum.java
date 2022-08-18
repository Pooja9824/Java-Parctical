import java.util.*;

class numGame {
    Scanner sc = new Scanner();
    Random ra = new Random();

    numGame() {
        int i = ra.nextInt();
        System.out.println("Random number is generated");
    }

    public int takeUserInput() {
        int j = sc.nextInt();
        System.out.println("guess the number");
        System.out.println("Reading..." + j);

    }

    public void IsCorrectNum() {

    }
}

class GuessTheNum {
    public static void main(String[] args) {

    }
}