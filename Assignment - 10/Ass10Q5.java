class A {
    void mA() {
        System.out.println("Method of class A");
    }
}

class B extends A {
    void mB() {
        System.out.println("Method of class B");
    }
}

class C extends B {
    void mC() {
        System.out.println("Method of class C");
    }
}

interface D {
    void mD();
}

class E extends C implements D {
    public void mD() {
        System.out.println("Method of interface D");
    }
}

public class Ass10Q5 {
    public static void main(String[] SCP) {
        E e1 = new E();
        e1.mA();
        e1.mB();
        e1.mC();
        e1.mD();
    }
}