public class operator_demo {
    public static void main(String[] args) {
        // ----> operators

        float a = 5;
        float b = 10;
        // a += 10;
        // System.out.println(a);
        System.out.println(a < b);
        System.out.println(a < b && a > b);
        System.out.println(a < b || a > b);

        // ----------------

        float c = 10 + 100 * 13 - 48 / 8;
        System.out.println(c);

        // ----------------

        int d = 10;
        int f = 20;
        System.out.println(d++);
        System.out.println(d);
        System.out.println(--f);

    }

}
