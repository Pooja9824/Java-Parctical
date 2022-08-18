class Box {
    double h, w, b;

    Box() {
        h = 10;
        w = 5;
        b = 6;
    }

    double volume() {
        return h * w * b;
    }
}

class ConstructorDemo {
    public static void main(String args[]) {
        double vol;
        Box b1 = new Box();
        Box b2 = new Box();
        vol = b1.volume();
        System.out.println("volume of b1=" + vol);
        vol = b2.volume();
        System.out.println("volume of b2= " + vol);
    }
}