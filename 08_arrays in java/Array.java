import java.lang.*;

class Array
{
	public static void main(String args[])
	{
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println("Length of array = " + arr.length);
		
		int brr[] = {11,21,51,101,121};
		
		int crr[] = new int[]{100,200,300,400,500};
		
		for(int iCnt = 0; iCnt < arr.length; iCnt++)
		{
			System.out.println(arr[iCnt]);
		}
	}
}
