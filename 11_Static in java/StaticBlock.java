
// Static block use to initialise static data
// static block called as soon as .class file loaded on jvm
// non static data initialised in constructor

class StaticBlock
{
	public static void main(String args[])
	{	
		System.out.println("inside main");
		
		System.out.println(StaticBlockDemo.x);
		System.out.println(StaticBlockDemo.y);
		
		StaticBlockDemo sbd1 = new StaticBlockDemo(2,4);
		StaticBlockDemo sbd2 = new StaticBlockDemo(7,8);
	}
}

class StaticBlockDemo
{
	public int i,j;
	public static int x,y;
	
	static	// static block
	{
		System.out.println("inside Static Block");
		x = 10;
		y = 20;
	}
	
	public StaticBlockDemo(int a, int b)
	{
		System.out.println("inside StaticBlockDemo constructor");
		i = a;
		j = b;
	}
	
	
}