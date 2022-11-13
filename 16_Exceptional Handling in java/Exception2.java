
import java.util.Scanner;

class Exception2
{
	public static void main(String args[])
	{
		
		Scanner sobj = new Scanner(System.in);
		int no1 = 0,no2 = 0;
		float result = 0.0f;
			
		System.out.println("Enter number first : ");
		no1 = sobj.nextInt();
		System.out.println("Enter number second : ");
		no2 = sobj.nextInt();
		
		try	// exception prone code
		{
			result = no1/no2;
			System.out.println("Division is : "+result);
		}
		catch(ArithmeticException obj)	// catches exception
		{
			System.out.println("Exception occured : "+obj);
		}
		//Exception occured : java.lang.ArithmeticException: / by zero
		
		finally
		{
			System.out.println("inside finally");
		}
		
		System.out.println("End of program");
	}
}