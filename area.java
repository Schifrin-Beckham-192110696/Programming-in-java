import java.io.*;
import java.util.*;
class area
{
 public static void main(String args[])
 {
  double a,r,square,circle;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter side of square:");
  a=sc.nextFloat();
  square=a*a;
  System.out.println("Area of Square="+square);
  System.out.println("Enter radius of circle:");
  r=sc.nextFloat();
  circle=3.14*r*r;
  System.out.println("Area of circle="+circle);
  }
}  
