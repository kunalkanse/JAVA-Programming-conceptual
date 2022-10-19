import java.lang.*;

class Functionoverload
{
	public static void main(String arg[])
	{
		System.out.println("inside main");
		
		Demo obj;  //reference
		
		obj = new Demo();
		
		System.out.println("Addition of two integers : "+obj.Add(10,20));
		System.out.println("Addition of two floats : "+obj.Add(10.5f,20.5f));
	}
}

class Demo
{
	public int Add(int no1 , int no2)
	{
		System.out.println("inside first Add");
		return no1 + no2;
	}
	
	public float Add(float no1 , float no2)
	{
		System.out.println("inside second Add");
		return no1 + no2;
	}
}
