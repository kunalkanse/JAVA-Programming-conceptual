
// if the method is declared as final then we cannot override that method in derived class

class FinalMethod
{
	public static void main(String args[])
	{
		Base bobj = new Derived();
		
		System.out.println("Value of i = "+bobj.i);
		
		bobj.gun();
		
		bobj.fun();	
	}
}

class Base
{
	public final int i;	// as variable i is final we cannot change it
	public int j;
	
	public Base()
	{
		i = 10;
		j = 20;
	}
	
	public final void gun()	// can't override final method in derived class
	{
		System.out.println("Inside Base gun");
	}
	
	public void fun()
	{
		System.out.println("Inside Derived fun");
	}
}

class Derived extends Base
{
	
	
	/*public void gun()	// Error :  gun() in Derived cannot override gun() in Base
	{
		System.out.println("Inside derived gun");
	}*/
	
	public void fun()
	{
		System.out.println("Inside Derived fun");
	}
}