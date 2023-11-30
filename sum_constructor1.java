import java.io.*;
import java.util.*;
class add
{
 int a,b,c;
 add(int a,int b)
 {
  c=a+b;
  System.out.println("Sum="+c);
 } 
}

class sum_constructor1
{
 public static void main(String args[])
 {
  add ob=new add(10,20);
 }
}