class Vehicle {
    void drive() {
        System.out.println("Driving a Vehicle");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a Car");
    }
}

public class Ass9Q1{
    public static void main(String[] SCP) {
        Vehicle v1 = new Vehicle();
        Car c1 = new Car();

        v1.drive();
        c1.drive();
    }
}