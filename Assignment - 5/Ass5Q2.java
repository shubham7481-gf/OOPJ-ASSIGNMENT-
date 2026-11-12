import java.lang.*;

public class Ass5Q2
{
    
    public static void main(String SCP[])
   {
       double e=0.0,fact=1.0;

       for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 1; j++) {
                 fact=fact*j;
             }
             e=e+(1.0/fact);
       }

       System.out.println("Value of e= "+e); 
   }
}
