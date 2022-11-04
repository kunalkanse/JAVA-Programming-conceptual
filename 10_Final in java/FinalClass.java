
// if the class is declared as final then we cannot extends that class
// composition is allowed for final class
// we can create object of final class in another class by composition

class FinalClass
{
	public static void main(String args[])
	{
		Base bobj = new Base();
		Demo dobj = new Demo();
		
		dobj.gun();
	
	}
}

final class Base	//cannot inherit from final Base
{
	public final int i;	// as variable i is final we cannot change it
	public int j;
	
	public Base()
	{
		System.out.println("Inside Base constructor");
		i = 10;
		j = 20;
	}
	
	public final void gun()	// can't override final method in derived class
	{
		System.out.println("Inside Base gun");
	}
	
	public void fun()
	{
		System.out.println("Inside Base fun");
	}
}

/*
class Derived extends Base	//error: cannot inherit from final Base
{
	
}
*/

class Demo
{
	public Base bobj;	//composition 
						//if class is final we can use class content by using composition
	
	public Demo()
	{
		System.out.println("Inside Demo constructor");
		
		bobj = new Base();
	}
	public void gun()
	
		System.out.println("Inside Demo gun");
		bobj.fun();
	}
}