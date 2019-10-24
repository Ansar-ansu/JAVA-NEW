import java.io.*;
class overload
{
	double vol(float l,float w,float h)
	{
	return l*w*h;
	}
	double vol(float l)
	{
		return l*l*l;
	}
	double vol(float r,float h)
	{
		return 3.14*r*r*h;
	}
}
class methodoverloading
{
	public static void main(String[]args) throws IOException
	{
	overload overload=new overload();
	float x,y,z;
	BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the length,breadth and height of rectangle:");
	x=Integer.parseInt(kb.readLine());
	y=Integer.parseInt(kb.readLine());
	z=Integer.parseInt(kb.readLine());
	double rectanglebox=overload.vol(x,y,z);
	System.out.println("volume of rectangular box is"+rectanglebox);
	System.out.println("Enter the length of cube:");
	x=Integer.parseInt(kb.readLine());
	double cube=overload.vol(x,y,z);
	System.out.println("Volume of the length of cube is:"+cube);
	System.out.println("Enter the radius and height of cylinder:");
	x=Integer.parseInt(kb.readLine());
	y=Integer.parseInt(kb.readLine());
	double cylinder=overload.vol(x,y);
	System.out.println("Volume of the cylinder is:"+cylinder);
		
	}
}