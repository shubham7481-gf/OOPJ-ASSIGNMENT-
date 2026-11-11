import java.lang.*;
import java.util.Scanner;

class Ass6Q2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of elements: ");
int n=sc.nextInt();

int a[]=new int[n];
System.out.println("Enter "+n+" elements: ");
int sum=0;
for(int i=0; i<n; i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}

double avg=(double)sum/n;

System.out.println("The average of array element is : "+avg);

sc.close();
}
}