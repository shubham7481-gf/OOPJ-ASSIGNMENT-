import java.lang.*;
import java.util.Scanner;

class Ass3Q5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
 
double costP,sellP,diff,loss,profit;

System.out.println("Enter cost price: ");
costP=sc.nextDouble();

System.out.println("Enter sell price: ");
sellP=sc.nextDouble();

if(costP==sellP)
{
System.out.println("No profit or loss");
}
else if(costP>sellP)
{
diff=costP-sellP;
loss=(diff*100)/costP;
System.out.println("Loss percentage: "+loss+"%");
}
else
{
diff=sellP-costP;
profit=(diff*100)/costP;
System.out.println("Profit percentage: "+profit+"%");
}

sc.close();
}
}