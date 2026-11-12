import java.util.Scanner; 
import java.lang.*;

class Interest {
    double calculate(double p, int t) {
        double r = 5.0;
        return (p * t * r) / 100;
    }

    double calculate(int t, double r) {
        double p = 10000.0;
        return (p * t * r) / 100;
    }
}

class Ass7Q4 {
    public static void main(String SCP[]) {
        Scanner sc = new Scanner(System.in);

        Interest obj = new Interest();

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter time: ");
        int t1 = sc.nextInt();

        double si1 = obj.calculate(p, t1);
        System.out.println("Simple Interest (Default Rate 5%): " + si1);

        System.out.print("\nEnter time: ");
        int t2 = sc.nextInt();

        System.out.print("Enter rate: ");
        double r = sc.nextDouble();

        double si2 = obj.calculate(t2, r);
        System.out.println("Simple Interest (Default Principal 10000): " + si2);

        sc.close();
    }
}