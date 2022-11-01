import java.lang.*;

class Super
{
	public static void main(String args[])
	{
		Derived dobj = new Derived();
		dobj.gun();
	}
}

class Base
{
	public int x,y;
	
	public Base(int a,int b)
	{
		System.out.println("Base constructor");
		this.x = a;
		this.y = b;
	}
	
	public void fun()
	{
		System.out.println("inside base fun");
	}
}

class Derived extends Base
{
	public int a,b;
	
	public Derived()
	{
		super(10,20);	//we can call the constructor of Base class
		System.out.println("Derived Constructor");
	}
	
	public void gun()
	{
		System.out.println("Value of x : " +super.x);	//we can access the characteristics of Base class
		super.fun();	//we can call the method of Base class
	}
}
