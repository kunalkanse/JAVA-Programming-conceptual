class InerfaceExtendsInterface
{
	public static void main(String arg[])
	{
		Marvellous mobj = new Marvellous();
		mobj.fun();
		mobj.gun();
	}
}

interface Base
{
	void fun();
}

interface Derived extends Base
{
	void gun();
}

class Marvellous implements Derived	// 4
{
	public void fun()
	{
		System.out.println("Inside fun");
	}
	public void gun()
	{
		System.out.println("Inside gun");
	}
}
