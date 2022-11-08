
class ClassImplementsMultipleInterfaces
{
	public static void main(String args[])
	{
		Demo dobj = new Demo();
		
		dobj.fun();
		dobj.fun(11);
		dobj.gun();
		
		System.out.println("Value of i from interface1 : "+interface1.i);
		System.out.println("Value of i from interface2 : "+interface2.i);
	}
}

interface interface1
{
	int i = 10;
	void fun();
	void gun();
}

interface interface2
{
	int i = 20;
	void fun(int no);
}

class Demo implements interface1, interface2
{
	public void fun()
	{
		System.out.println("Inside fun");
	}
	
	public void fun(int no)
	{
		System.out.println("Inside fun with argument");
	}
	
	public void gun()
	{
		System.out.println("Inside gun");
	}
}
