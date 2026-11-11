import java.lang.*;
import java.util.Scanner;

class Ass5Q5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Generating 3-digit numbers using 1, 2, 3...");
int c=0;

for(int i=1; i<=3; i++)
{
for(int j=1; j<=3; j++)
{
for(int k=1; k<=3; k++)
{
if(i!=j && j!=k && i!=k)
{
int num=i*100+j*10+k;
System.out.println(num);
c++;
}
}
}
}

System.out.println("Total 3-digit numbers: "+c);

sc.close();
}
}