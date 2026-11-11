import java.lang.*;

class Ass1Q1{

          public static void main(String args[]){
               double length = 5.0;
               double breadth = 4.0;
               double height = 3.0;

               double volumeRectangle = length * breadth * height; 
               double volumeSquare = length * length * length;     
               double volumeCube = length * length ;       

               System.out.println("Volume of Rectangle: " + volumeRectangle);
               System.out.println("Volume of Square: " + volumeSquare);
               System.out.println("Volume of Cube: " + volumeCube);
           }
 }