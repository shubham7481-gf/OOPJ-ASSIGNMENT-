import java.util.Scanner;

class Circle {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    double getRadius() {
        return radius;
    }
    
    void setRadius(double radius) {
        this.radius = radius;
    }
    
    double calculateArea() {
        return 3.14 * radius * radius;
    }
    
    double calculateCircumference() {
        return 2 * 3.14 * radius;
    }
}

public class Ass8Q5 {
    public static void main(String[] SCP) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        
        Circle circle = new Circle(r);
        
        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Area = " + circle.calculateArea());
        System.out.println("Circumference = " + circle.calculateCircumference());
        
        System.out.print("\nEnter new radius to modify: ");
        double newRadius = sc.nextDouble();
        circle.setRadius(newRadius);
        
        System.out.println("Area = " + circle.calculateArea());
        System.out.println("Circumference = " + circle.calculateCircumference());
    }
}