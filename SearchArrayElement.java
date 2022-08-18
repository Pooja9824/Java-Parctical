import java.util.*;

class SearchArrayElement {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int val1 = 0;
        int val2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 values:-");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("value " + i + "= ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a value which you want to find:-");

        int j = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == j) {
                val1 = 1;
                break;
            }
            val2 = i;
        }
        if (val1 == 1) {
            System.out.println("Value " + j + " is found at " + (val2 + 1));
        } else {
            System.out.println("Value is not found");
        }
    }
}