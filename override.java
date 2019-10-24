import java.util.Scanner;
class greatest2

{
int n1,n2;
void greatest()
     {
	 Scanner d=new Scanner(System.in);
	 System.out.println("enter two numbers");
	 n1=d.nextInt();
	 n2=d.nextInt();
	 if(n1>n2)
	 System.out.println("greatest is:"+n1);
	 else
	 System.out.println("gretest is:"+n2);
	 }
}
class greatest3 extends greatest2
{
int n1,n2,n3;
//@override
void greatest()
   {
   Scanner d=new Scanner(System.in);
   System.out.println("enter 3 numbers");
   n1=d.nextInt();
   n2=d.nextInt();
   n3=d.nextInt();
   if((n1>n2)&&(n1>n3))
   System.out.println("greatest is:"+n1);
   else if(n2>n3)
   System.out.println("greatest is:"+n2);
   else
   System.out.println("greatest is:"+n3);
   }
}
public class override
{
public static void main(String args[])
   {
     greatest2 g1=new greatest2();
	 g1.greatest();
	 greatest3 g2=new greatest3();
	 g2.greatest();
   }
}