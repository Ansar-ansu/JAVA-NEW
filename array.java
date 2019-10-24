import java.util.Scanner;
import java.io.*;
 public class array
{
public static void main(String args[])throws IOException
     {
	   int s=0,i,avg;
	   int a[]=new int[ 10];
	   Scanner k=new Scanner(System.in);
	   System.out.println("enter the elements");
	   for(i=0;i<10;i++)
	         {
			   a[i]=k.nextInt();
			   s=s+a[i];
			  }
     avg =s/10;
     int min=a[0];
     int max=a[0];
     for(i=0;i<10;i++)
           {
		     if (min>a[i])
             min=a[i];
             else if(max<a[i])
             max=a[i];
            }
   System.out.println("sum of elements="+s);
    System.out.println("avg of elements="+avg);
     System.out.println("maximum="+max);
      System.out.println("minimum="+min);
      }
}	  
	  
 
  
   
