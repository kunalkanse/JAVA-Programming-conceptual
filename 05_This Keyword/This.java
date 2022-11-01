
//use of this keyword

class This
{
	public static void main(String args[])
	{
		ThisUse th = new ThisUse(10,20);
		th.gun();
	}
}

class ThisUse
{
	public int x;
	public int y;
	
	public ThisUse()
	{
		System.out.println("Default constructor");
	}
	
	public ThisUse(int a, int b)
	{
		this();		//we can call constructor of same class using this keyword
		System.out.println("Parameterized constructor");
		this.x = a;
		this.y = b;
	}
	
	public void fun()
	{
		System.out.println("inside fun");
		System.out.println("this.x : " +this.x);	//we can access non static characteristics of same class using this keyword
	}
	
	public void gun()
	{
		this.fun();	//we can call non static method of same class using this keyword
	}
}
