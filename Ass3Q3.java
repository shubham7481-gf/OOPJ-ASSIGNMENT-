import java.lang.*;
import java.util.Scanner;

class Ass3Q3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter electricity consumption: ");
double e=sc.nextDouble();

double cost;

if(e<=100)
{
cost=e*3;
}
else if(e<=500)
{
cost=(100*3)+(e-100)*4;
}
else
{
cost=(100*3)+(400*4)+(e-500)*6;
}

System.out.println("Total electricity cost: RS "+cost);

sc.close();
}
}