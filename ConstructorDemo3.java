public class ConstructorDemo3 {
    int id;
    String name;

    ConstructorDemo3() {
        System.out.println("this is the default constructor");
    }

    ConstructorDemo3(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        ConstructorDemo3 cd = new ConstructorDemo3();
        System.out.println("\n default constructor values:-");
        System.out.println("\n student id=" + cd.id + "\n Student name=" + cd.name);
        System.out.println("\n parameterised consructor values:- \n");
        ConstructorDemo3 cd1 = new ConstructorDemo3(1, "pooja");
        System.out.println("\n student id=" + cd1.id + "\n student name=" + cd1.name);
    }
}
