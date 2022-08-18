
public class string_demo {
    public static void main(String[] args) {
        String name = "Pooja";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        // --------------------------------

        String nonTrimmedString = "    pooja      ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(2, 4));

        System.out.println(name.startsWith("Poo"));
        System.out.println(name.endsWith("ja"));

    }
}
