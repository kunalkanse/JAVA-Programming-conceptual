import java.util.*;

class ArrayInput
{
	public static void main(String args[])
	{
		int size = 0, i = 0, sum = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		size = sobj.nextInt();
		
		int arr[] = new int[size];
		
		for(i = 0; i < arr.length; i++)	//input array elements
		{
			arr[i] = sobj.nextInt();
		}
		
		for(i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("sum of array elements = " +sum);
	}
}
