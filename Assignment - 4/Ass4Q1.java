import java.lang.*;
import java.util.Scanner;

public class Ass4Q1 
{
    
    public static void main(String SCP[])
   {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        if (a == 0) {

            System.out.println("\nIt is not a quadratic equation.");

        } else {

            double D = (b*b) - (4*a*c);

            if (D > 0) {
                double r1 = (-b+Math.sqrt(D))/(2*a);
                double r2 = (-b-Math.sqrt(D))/(2*a);

                System.out.println("\nThe Equation have Real and Distinct Roots.");
                System.out.printf("1st Root = %.2f\n", r1);
                System.out.printf("2nd Root = %.2f", r2);

            } else if (D == 0) {
                double r = -b/(2*a);

                System.out.println("\nThe Equation have Real and Equal Roots.");
                System.out.printf("1st Root = 2nd Root = %.2f\n", r);

            } else {
                double realP = -b/(2*a);
                double imgP = Math.sqrt(-D)/(2*a);

                System.out.println("\nThe Equation have Complex Roots.");
                System.out.printf("1st Root= %.2f + %.2fi\n", realP, imgP);
                System.out.printf("2nd Root= %.2f - %.2fi", realP, imgP);
            }
        }


       
       sc.close();
    }
}



