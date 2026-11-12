import java.lang.*;

public class Ass5Q1
{
    public static void main(String SCP[])
   {
       int i,j;

       System.out.println("Printing the pattern\n"); 
       
       for (i=5; i>=1; i--) {
            for (j=1; j<=i; j++) {
                 System.out.print(" " + j);
             }
            System.out.println();
       }
    }
}