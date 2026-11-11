import java.util.Scanner;
import java.lang.*;

class Shape {
    static double rectArea(double l, double b) {
        return l * b;
    }

    double sqArea(double s) {
        return s * s;
    }
}

class Ass7Q3 {
    public static void main(String SCP[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        double ra = Shape.rectArea(l, b);
        System.out.println("Area of Rectangle: " + ra);

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();

        Shape sh = new Shape();
        double sa = sh.sqArea(s);
        System.out.println("Area of Square: " + sa);

        sc.close();
    }
}