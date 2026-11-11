import java.lang.*;
import java.util.Scanner;
class Ass3Q2
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

System.out.println("Enter Basic Salary: ");
double BS=sc.nextDouble();

double HRA=(BS*10)/100;
double DA=(BS*60)/100;

double GS = HRA+DA+BS;

System.out.println("Gross Salary: "+GS);

sc.close();
}
}