import java.io.*;
import java.util.*;
class arith
{
 public static void main(String args[])
 {
  String op;
  float a,b;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the numbers and b:");
  a=sc.nextFloat();
  b=sc.nextFloat();
  System.out.println("Enter the Operation:'+'-Addition '-'-Subtraction '*' Multiplication '/'-Divison '%'-Modulus");
  op=sc.next();
  switch(op)
  {
   case "+":
             System.out.println("Sum="+(a+b));
             break;
   case "-":
             System.out.println("Difference="+(a-b));
             break;   
   case "*":
             System.out.println("Product="+(a*b));
             break;
   case "/":
             System.out.println("Quotient="+(a/b));
             break;  
   case "%":
             System.out.println("Remainder="+(a%b));
             break;    
   default:
             System.out.println("Incorrect Input.Kindly Check");
  }
 }
}         