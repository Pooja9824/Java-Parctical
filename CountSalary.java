import java.util.*;

class CountSalary {
    public static void main(String args[]) {
        String gen;
        String name;
        int sal;
        float ta;
        float da;
        float total;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name:-");
        name = sc.nextLine();
        System.out.println("Enter your Gender(m/f):-");
        gen = sc.nextLine();
        System.out.println("Enter Your salary:-");
        sal = sc.nextInt();
        System.out.println("Your name is=" + name + " and gender is=" + gen);

        System.out.println("----------------------------------");

        if (gen.equals("m")) {
            if (sal < 10000) {
                ta = sal * 5 / 100;
                da = sal * 10 / 100;
                total = sal + ta + da;
                System.out.println("salary= " + sal + "  ta= " + ta + "  da= " + da);
                System.out.println("Total Salary=" + total);
            } else if (sal >= 10000 && sal < 60000) {
                ta = sal * 6 / 100;
                da = sal * 11 / 100;
                total = sal + ta + da;
                System.out.println("salary=" + sal + "  ta=" + ta + "  da=" + da);
                System.out.println("Total Salary= " + total);
            } else if (sal >= 60000) {
                ta = sal * 7 / 100;
                da = sal * 12 / 100;
                total = sal + ta + da;
                System.out.println("salary=" + sal + "  ta=" + ta + "  da=" + da);
                System.out.println("Total Salary=" + total);
            } else {
                System.out.println("Enter Proper Value");
            }

        } else if (gen.equals("f")) {
            if (sal < 10000) {
                ta = sal * 4 / 100;
                da = sal * 9 / 100;
                total = sal + ta + da;
                System.out.println("salary=" + sal + "  ta=" + ta + "  da=" + da);
                System.out.println("Total Salary=" + total);
            } else if (sal >= 10000 && sal < 60000) {
                ta = sal * 3 / 100;
                da = sal * 8 / 100;
                total = sal + ta + da;
                System.out.println("salary=" + sal + "  ta=" + ta + "  da=" + da);
                System.out.println("Total Salary=" + total);
            } else if (sal >= 60000) {
                ta = sal * 2 / 100;
                da = sal * 7 / 100;
                total = sal + ta + da;
                System.out.println("salary=" + sal + "  ta=" + ta + "  da=" + da);
                System.out.println("Total Salary=" + total);
            } else {
                System.out.println("Enter Proper Value");
            }
        } else {
            System.out.println("Enter m or f");
        }
    }
}