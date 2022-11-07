
// unnamed block is used to initialise non static characteristics
// unnamed block called before every constructor

class Unnamed
{
	public static void main(String args[])
	{
		UnnamedDemo ud1 = new UnnamedDemo();
		UnnamedDemo ud2 = new UnnamedDemo(11,21);
	}
}

class UnnamedDemo
{
	public int i,j;
	public static int x,y;
	
	//unnamed block
	{
		System.out.println("inside unnamed block");
		i = 10;
		j = 20;
	}
	
	public UnnamedDemo()
	{
		System.out.println("inside default constructor");
	}
	
	public UnnamedDemo(int a,int b)
	{
		System.out.println("inside parameterized constructor");
	}
	
	static
	{
		System.out.println("inside static block");
		x = 11;
		y = 21;
	}
}
