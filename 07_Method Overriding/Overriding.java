import java.lang.*;

class Overriding
{
	public static void main(String args[])
	{
		Base bp = new Derived();
		bp.fun();	//Derived fun
		bp.gun();	//Base gun
		
		//bp.sun();	//Derived sun
		
	}
}

class Base
{
	public void fun()
	{
		System.out.println("Base fun");
	}
	
	public void gun()
	{
		System.out.println("Base gun");
	}
}

class Derived extends Base
{
	public void fun()
	{
		System.out.println("Derived fun");
	}
	
	public void sun()
	{
		System.out.println("Derived sun");
	}
}
