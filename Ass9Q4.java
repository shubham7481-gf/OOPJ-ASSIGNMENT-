import java.util.Scanner;

class Shape {
    double getPerimeter() {
        return 0;
    }

    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }
   
    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    double getArea() {
        return Math.PI * r * r;
    }
}

public class Ass9Q4 {
    public static void main(String[] SCP) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        Circle c1 = new Circle(r);
        System.out.println("Radius = " + c1.r);
        System.out.println("Perimeter = " + c1.getPerimeter());
        System.out.println("Area = " + c1.getArea());

        sc.close();
    }
}