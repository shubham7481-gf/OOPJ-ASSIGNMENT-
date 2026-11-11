interface Walker {
    default void mv() {
        System.out.println("Walking...");
    }
}

interface Swimmer {
    default void mv() {
        System.out.println("Swimming...");
    }
}

class Duck implements Walker, Swimmer {
    public void mv() {
        Walker.super.mv();
        Swimmer.super.mv();
    }
}

public class Ass10Q2 {
    public static void main(String[] SCP) {
        Duck d1 = new Duck();
        d1.mv();
    }
}