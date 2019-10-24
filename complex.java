import java.util.Scanner;
class complex
{
   int r,i;
   complex(int a,int b)
   {
     r=a;
	 i=b;
	}
   complex add(complex a,complex b)
     {
	   complex temp=new complex();
        temp.r=a.r+b.r;
       temp.i=a.i+b.i;
        return temp;
      }
}
	public class comp
	{
	public static void main(String args[])
		{
			Scanner d=new Scanner(System.in);
			System.out.println("Enter first complex number:\nEnter the real and imaginary part:");
			Int a=d.nextInt();
			Int b=d.nextInt();
			complex ob1=new complex(a,b);
			System.out.println("Enter second complex number:\nEnter real and imginery part:");
			Int c=d.nextInt();
			Int e=d.nextInt();
			complex ob2=new complex(c,e);
			complex ob3=new complex();
			ob3=ob3.add(ob1.ob2);
			System.out.println("The sum of complex number is \n"+ ob3.real"+i"+ob3.i);
		}
	}
   