import java.lang.*;
import java.util.Scanner;

class Ass3Q1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter marks of sub1: ");
int sub1=sc.nextInt();

System.out.println("Enter marks of sub2: ");
int sub2=sc.nextInt();

System.out.println("Enter marks of sub3: ");
int sub3=sc.nextInt();

System.out.println("Enter marks of sub4: ");
int sub4=sc.nextInt();

System.out.println("Enter marks of sub5: ");
int sub5=sc.nextInt();

int total=sub1+sub2+sub3+sub4+sub5;

double percentage=total/5;

System.out.println("Total marks = "+total);
System.out.println("Total percentage = "+percentage+"%");

sc.close();
}
}