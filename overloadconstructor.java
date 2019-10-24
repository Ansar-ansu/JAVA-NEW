import java.io.*;
class area
{
	area(int a)
	{
		System.out.println("area of square is"+(a*a));
	
	}
	area(int a,int b)
	{
		System.out.println("area of rectangle is"+(a*b));
	}
}
public class overloadconstructor
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the side of square");
		int a=Integer.parseInt(k.readLine());
		area kb=new area(a);
		System.out.println("Enter the sides of the rectangle");
		int c=Integer.parseInt(k.readLine());
		int b=Integer.parseInt(k.readLine());
		area kc=new area(c,b);
	}
}