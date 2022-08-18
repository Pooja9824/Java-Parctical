class A {
    final void meth() {
        System.out.println("this is final method");
    }
}

class B extends A {
    void meth1() {
        System.out.println("illegal");
    }
}

class UsingFinalWithInhe {
    public static void main(String[] args) {
        B obj = new B();
        obj.meth();
        obj.meth1();
    }
}