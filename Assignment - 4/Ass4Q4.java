import java.lang.*;
import java.util.Scanner;

public class Ass4Q4
{
    
    public static void main(String SCP[])
   {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter first number: ");
       double num1 = sc.nextDouble();

       System.out.print("Enter second number: ");
       double num2 = sc.nextDouble();

       System.out.print("Enter third number: ");
       double num3 = sc.nextDouble();

       if (num1 >= num2 && num1 >= num3) {
            System.out.println("Greatest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Greatest number is: " + num2);
        } else {
            System.out.println("Greatest number is: " + num3);
        }

       sc.close();
    }
}

