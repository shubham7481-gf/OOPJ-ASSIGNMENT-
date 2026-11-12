import java.lang.*;

class Ass2Q1
{
public static void main(String args[])
{

int num=457;

int sum=0;
int temp=num;

while(temp!=0)
{
sum=sum+temp%10;
temp=temp/10;
}

System.out.println("Sum of digits: "+sum);

}
}