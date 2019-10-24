public class except
{
	static void validdata(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
		System.out.println("valid age");
		}
	}
	public static void main(String args[])
	{
		try
		{
			except t=new except();
			t.validdata(10);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}