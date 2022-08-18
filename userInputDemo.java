import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;

class userInputDemo {
    public static void main(String[] args) {
        // demo 1
        // System.out.println("Hello Java");

        // demo 2
        // int a = 4;
        // int b = 7;
        // int c = 10;
        // float sum = a + b + c;
        // System.out.println(sum / 2);

        // demo 3
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + " have a good day!");

    }
}