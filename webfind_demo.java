import java.util.Scanner;

public class webfind_demo {
    public static void main(String[] args) {
        System.out.println("enter your website name:-");
        Scanner sc = new Scanner(System.in);
        String web = sc.next();

        if (web.endsWith(".org")) {
            System.out.println("This is an organizational website");
        } else if (web.endsWith(".com")) {
            System.out.println("This is a comersial website");
        } else if (web.endsWith(".in")) {
            System.out.println("This is indian website");
        } else {
            System.out.println("your website name is invalid");
        }
    }
}