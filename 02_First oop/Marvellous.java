import java.lang.*;

class Marvellous
{
	public static void main(String args[])
	{
		System.out.println("inside main");
		Arithmatic obj1;
		obj1 = new Arithmatic();
		
		Arithmatic obj2 = new Arithmatic(10,20);
		
		int ret = 0;
		
		ret = obj2.Addition();
		System.out.println("The addition is : " +ret);
		
		ret = obj2.subtraction();
		System.out.println("The subtraction is : " +ret);
	}
}

class Arithmatic
{
	public int no1;
	public int no2;
	
	public Arithmatic()
	{
		System.out.println("inside Default constructor");
		this.no1 = 0;
		this.no2 = 0;
	}
	
	public Arithmatic(int x , int y)
	{
		System.out.println("inside paramterized constructor");
		this.no1 = x;
		this.no2 = y;
	}
	
	public int Addition()
	{
		int ans = 0;
		ans = no1 + no2;
		return ans;
	}
	
	public int subtraction()
	{
		int ans = 0;
		ans = no1 - no2;
		return ans;
	}
}
