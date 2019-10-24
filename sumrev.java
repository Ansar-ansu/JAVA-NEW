import java.util.Scanner;
class sumrev
{
  int sum(int n)
      { 
	    int s=0,r;
		int a=n;
		while(a>0)
		   {
		     r=a%10;
			 s=s+r;
			 a=a/10;
			}
   	 	    return s;
		}
    int rev(int n)
        {
		  int r=0,s;
          while(n>0)	
		  {
		    s=n%10;
			r=r*10+s;
			n=n/10;
			}
			return r;
		}
    public static void main(String args[])
     {
	   Scanner k=new Scanner(System.in);
	   System.out.println("enter a number");
		int n=k.nextInt();
		sumrev d=new sumrev();
		System.out.println("sum of digit is "+d.sum(n));
	     System.out.println("the reverse of number is"+d.rev(n));
		}
}		