import java.util.*;

class ArrayInputOOP
{
	public static void main(String args[])
	{
		int iSize = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the size in array : ");
		iSize = sobj.nextInt();
		
		Array obj = new Array(iSize);
		
		obj.Accept();
		obj.Display();
	}
}

class Array
{
	public int arr[];
	
	public Array(int iSize)
	{
		arr = new int[iSize];
	}
	
	public void Accept()
	{
		System.out.println("Enter the elements in array : ");
		Scanner sobj = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}
	}
	
	public void Display()
	{
		System.out.println("elements in array are : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
