
// throws keyword
// method Division() may throws exception

import java.util.Scanner;

class Exception3
{
	public static void main(String args[])
	{
		
		Scanner sobj = new Scanner(System.in);
		Demo dobj = new Demo();
		
		int no1 = 0,no2 = 0;
		float ret = 0.0f;
		
		System.out.println("Enter number first : ");
		no1 = sobj.nextInt();
		System.out.println("Enter number second : ");
		no2 = sobj.nextInt();
		
		try	// exception prone code
		{
			ret = dobj.Division(no1,no2);	//exception prone method called from try block
			
			System.out.println("Division is : "+ret);
		}
		catch(ArithmeticException obj)	// catches exception
		{
			System.out.println("Exception occured : "+obj);
		}
		//Exception occured : java.lang.ArithmeticException: / by zero
	}
}

class Demo
{
	public float Division(int x,int y) throws ArithmeticException
	{
		float result = 0.0f;
		result = x / y;
		return result;
	}
}