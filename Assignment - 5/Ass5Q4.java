import java.lang.*;
import java.util.Scanner;

class Ass5Q4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("Enter size: ");
int n=sc.nextInt();

int a[]=new int[n];
System.out.println("Enter "+n+" elements: ");
for(int i=0; i<n; i++)
{
a[i]=sc.nextInt();
}

for(int i=0; i<n-1; i++)
{
for(int j=0; j<n-i-1; j++)
{
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}

System.out.print("Enter element to search: ");
int k=sc.nextInt();

int l=0, h=n-1, pos=-1;
while(l<=h)
{
int m=l+(h-l)/2;
if(a[m]==k)
{
pos=m;
break;
}
else if(a[m]<k)
{
l=m+1;
}
else
{
h=m-1;
}
}

if(pos!=-1)
{
System.out.println("Element found at index: "+pos);
}
else
{
System.out.println("Element not found");
}

sc.close();
}
}