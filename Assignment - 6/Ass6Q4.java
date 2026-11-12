import java.lang.*;
import java.util.Scanner;

class Ass6Q4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter number of elements: ");
int n=sc.nextInt();

int arr[]=new int[n];
System.out.println("Enter "+n+" elements: ");
for(int i=0; i<n; i++)
{
arr[i]=sc.nextInt();
}

for(int i=0; i<n; i++)
{
boolean alreadySeen=false;
for(int k=0; k<i; k++)
{
if(arr[k]==arr[i])
{
alreadySeen=true;
break;
}
}

if(!alreadySeen)
{
for(int j=i+1; j<n; j++)
{
if(arr[i]==arr[j])
{
System.out.println("Duplicate Element: "+arr[i]);
break;
}
}
}
}

sc.close();
}
}