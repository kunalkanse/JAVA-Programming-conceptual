import java.lang.*;

class Inheritance
{
	public static void main(String args[])
	{
		Base bobj = new Base();
		bobj.fun();
		
		Derived dobj = new Derived();
		dobj.gun();
		dobj.fun();
	}
}

class Base 
{
	public int x;
	public int y;
	
	public Base()
	{
		System.out.println("inside Base constructor");
		this.x = 0;
		this.y = 0;
	}
	
	public void fun()
	{
		System.out.println("inside Base fun");
	}
}

class Derived extends Base
{
	public int a;
	public int b;
	
	public Derived()
	{
		System.out.println("inside Derived constructor");
		this.a = 0;
		this.b = 0;
	}
	
	public void gun()
	{
		System.out.println("inside Derived gun");
	}
}
