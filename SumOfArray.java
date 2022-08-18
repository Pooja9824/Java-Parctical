import java.util.*;

class SumOfArray {
    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        int arr1[][] = new int[2][2];
        int arr2[][] = new int[2][2];
        int sum[][] = new int[2][2];

        System.out.println("Enter values-->");
        System.out.println("----Metrix-1----");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print("arr1[" + i + "][" + j + "]=");
                arr1[i][j] = get.nextInt();
            }
        }

        System.out.println("----Metrix-2----");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print("arr2[" + i + "][" + j + "]=");
                arr2[i][j] = get.nextInt();
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("----sum----");

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}