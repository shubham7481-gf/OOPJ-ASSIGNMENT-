import java.lang.*;
import java.util.Scanner;

class Ass3Q4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number: ");
double n=sc.nextDouble();

if(n>0)
{
System.out.println(n+" is a positive number");
}
else if(n<0)
{
System.out.println(n+" is a negative number");
}
else
{
System.out.println("Given number is Zero");
}

sc.close();
}
}