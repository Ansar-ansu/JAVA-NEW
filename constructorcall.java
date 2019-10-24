class SecondConstructor
{
  int i,j;
  SecondConstructor(int i,int j)
    {
	  this.i=i;
	  this.j=j;
	 }
void display()
    {
    System.out.println("value of instant variable i:"+i);
	System.out.println("value of instant variable j:"+j);
	}
}
class constructorcall
{
	public static void main(String args[])
	{
	SecondConstructor Sc=new SecondConstructor(10,20);
	Sc.display();
	}
}