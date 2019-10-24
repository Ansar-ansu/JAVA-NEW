interface demo
{
  public double area(double s);
 }
   class circle implements demo  
    {
	   public double area (double s)
         {
		   double radius=s;
			return(3.14*radius*radius);
		}
	}
class sphere implements demo
{
 
	  public double area(double s)
		 {
		   double r=s;
		   return((4/3)*3.14*r*r*r);
		  }
	}
public class program
{
  public static void main(String args[])
   {
      circle s1=new circle();
		sphere s2=new sphere();
		double a=s1.area(10);
		double b=s2.area(3);
		System.out.println();
		System.out.println("area of circle"+a);
		System.out.println();
		System.out.println("area of sphere"+b);
	}
}	