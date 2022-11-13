
import java.util.Scanner;

class Exception1
{
	public static void main(String args[])
	{
		int arr[] = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		Scanner sobj = new Scanner(System.in);
			
		System.out.println("Array is of 5 elements");
		
		System.out.println("Enter the index you want : ");
		int index = sobj.nextInt();
		
		try	// exception prone code
		{
			System.out.println("Value at index is : "+arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException obj)	// catches exception
		{
			System.out.println("Exception occured : "+obj);
		}
		//Exception occured : java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
		
		finally
		{
			System.out.println("iniside finally");
		}
		
		System.out.println("End of program");
	}
}
