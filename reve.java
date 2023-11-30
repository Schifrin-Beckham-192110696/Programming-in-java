import java.io.*;
import java.util.*;
class reve
{  
public static void main(String args[])  
{    
 String s,rev="";
 int i;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the string:");
 s=sc.nextLine();
 for(i=0;i<s.length();i++)
     rev=s.charAt(i)+rev;
 System.out.println("Reverse="+rev);
}
}