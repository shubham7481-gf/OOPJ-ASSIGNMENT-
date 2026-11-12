import java.lang.*;

class Ass1Q5{

          public static void main(String args[]){
              double a = 3.0;
              double b = 4.0;
              double c = 5.0;

              double s = (a + b + c) / 2.0;
        
              double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
              System.out.println("Area of the triangle: " + area);
                    }
 }