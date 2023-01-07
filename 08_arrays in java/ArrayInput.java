import java.util.*;

class ArrayInput
{
	public static void main(String Arg[])
	{
		int iSize = 0, i = 0, iSum= 0;
		int arr[];
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the size of array");
		iSize = sobj.nextInt();

		arr = new int[iSize];

		System.out.println("Enter the elements");
		for(i = 0; i < arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}

		for(i =0; i < arr.length ; i++)
		{
			iSum = iSum + arr[i];
		}
		System.out.println("Addition of all elements : "+iSum);
	}
}

