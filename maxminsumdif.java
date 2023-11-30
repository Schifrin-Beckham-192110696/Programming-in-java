import java.io.*;
import java.util.*;
class maxminsumdif
{  
public static void main(String args[])  
{    
 int i,j,n,max,min; 
 int x[]=new int[20];
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter no.of elements:");
 n=sc.nextInt();
 System.out.println("Enter the values:");
 for(i=0;i<n;i++)
 { 
   x[i]=sc.nextInt();
 }
 System.out.println("THE ELEMENTS ARE:");
 for(i=0;i<n;i++)
 { 
   System.out.print(x[i]+"\t");
 }
 System.out.println();
 max=x[0];
 min=x[0];
 for(i=0;i<n;i++)
  {
    if(x[i]>max)
      max=x[i];
    if(x[i]<min)
      min=x[i];
   }
  System.out.println("MAXIMUM="+max+"...............MINIMUM="+min);
  System.out.println("SUM="+(max+min));
  System.out.println("DIFFERENCE="+(max-min));
 }
}
   
     