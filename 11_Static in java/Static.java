
class Static
{
	public static void main(String args[])
	{
		//calling static data using class name
		
		System.out.println("Value of static i : "+StaticDemo.i);
		StaticDemo.gun();
		
		StaticDemo dobj = new StaticDemo();
		
		System.out.println("Value of non-static j : "+dobj.j);
		dobj.fun();
	}
}

class StaticDemo
{
	public static int i = 10;
	public int j = 20;
	
	public void fun()
	{
		System.out.println("Inside non-static fun");
	}
	
	public static void gun()
	{
		System.out.println("Inside static gun");
		
		//System.out.println("Value of non-static j : "+dobj.j);	
		// Error : static methos can only access static characteristics
		
	}
}
