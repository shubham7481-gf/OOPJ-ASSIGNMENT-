import java.lang.*;
import java.util.Scanner;

class Ass6Q1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter number of elements: ");
int n=sc.nextInt();

int a[]=new int[n];
System.out.println("Enter "+n+" elements: ");
for(int i=0; i<n; i++)
{
a[i]=sc.nextInt();
}

for(int i=0; i<n-1; i++)
{
for(int j=0; j<n-1-i; j++)
{
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}

System.out.println("After Bubble Sort: ");
for(int i=0; i<n; i++)
{
System.out.print(a[i]+" ");
}
System.out.println();

sc.close();
}
}