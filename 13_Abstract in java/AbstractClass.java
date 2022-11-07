

class AbstractClass
{
	public static void main(String args[])
	{
		//Base obj = new Base();	 //error: Base is abstract; cannot be instantiated
		
		// we cannot create object but can create reference of abstract class
		Base obj;
		obj = new Derived();	// upcasting
		
		obj.fun();
		obj.gun();
		obj.sun();
		
		System.out.println(obj.i);
		
		//System.out.println(obj.j);	//error: cannot find symbol
	}
}

abstract class Base	//abstract class
{
	public int i = 10;
	
	public Base()
	{
		System.out.println("inside Base constructor");
		i = 10;
	}
	
	public void fun()
	{
		System.out.println("inside Base fun");
	}
	
	// defination
	public void gun()
	{
		System.out.println("inside Base gun");
	}
	
	public abstract void sun();	//abstract method
}

class Derived extends Base
{
	public int j = 20;
	
	public Derived()
	{
		System.out.println("inside Derived constructor");
		i = 10;
	}
	
	//overriding
	public void fun()
	{
		System.out.println("inside Derived fun");
	}
	
	public void sun()	//concrete method
	{
		System.out.println("inside Derived sun concrete method");
	}
}
