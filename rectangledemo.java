class rectangle
{
	double height;
	double width;
	double area()
	{
			return width*height;
	}
	void getvalue(double w,double h)
	{
		width=w;
		height=h;
	}
}
class rectangledemo
{
	public static void main(String args[])
	{
	 double area1,area2;
	 rectangle rec1=new rectangle();
	  rectangle rec2=new rectangle();
	  rec1.getvalue(7,8);
	    rec2.getvalue(8,7);
		area1=rec1.area();
		area2=rec2.area();
		System.out.println("area of rectanlge1 is"+area1);
		System.out.println("area of rectanlge2 is"+area2);
		if(area1==area2)
		{
		System.out.println("matching rectangles...both rectangles have he same area");
		}
		else if(area1>area2)
		{
		System.out.println(" rectangle 1's area is greater than rectangle 2's area");
		}
		else
		{
		System.out.println(" rectangle 2's area is greater than rectangle 1's area");
		}
	}
}