import java.util.Scanner;

class Rectangle {
    double width;
    double height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    double calculateArea() {
        return width * height;
    }
    
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class Ass8Q2 {
    public static void main(String[] SCP) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();
        
        System.out.print("Enter height of rectangle: ");
        double h = sc.nextDouble();
        
        Rectangle rect = new Rectangle(w, h);
        
        System.out.println("\n=== Rectangle Details ===");
        System.out.println("Width = " + rect.width);
        System.out.println("Height = " + rect.height);
        System.out.println("Area = " + rect.calculateArea());
        System.out.println("Perimeter = " + rect.calculatePerimeter());
    }
}