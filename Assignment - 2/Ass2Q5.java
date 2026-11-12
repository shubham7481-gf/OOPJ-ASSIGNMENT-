import java.lang.*;

class Ass2Q5
{
public static void main(String args[])
{
int minutes = 20000;

int totalDays = minutes / 1440;
int years = totalDays / 365;
int days = totalDays % 365;

System.out.println("Years: " + years);
System.out.println("Days: " + days);
}
}