import java.lang.*;

// jagged array in java 

class Jagged
{
	public static void main(String args[])
	{
		int arr[][] = new int[3][];
		
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[4];
		
		arr[0][0] = 10;	// arr[0] has 3 elements
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;	// arr[1] has 2 elements
		arr[1][1] = 50;
		
		arr[2][0] = 60;	// arr[2] has 4 elements
		arr[2][1] = 70;
		arr[2][2] = 80;
		arr[2][3] = 90;
		
		System.out.println("length of arr : " +arr.length);
		System.out.println("length of arr[2] : " +arr[2].length);
		System.out.println("arr[0][1] : " +arr[0][1]);
		System.out.println("arr[1][1] : " +arr[1][1]);
		System.out.println("arr[2][3] : " +arr[2][3]);
		
		System.out.println("*-*-*-*--*-**-*-*--*-**--**--**--*-*-*-*-*-*-*-**--*-*-*");
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int  j = 0; j < arr[i].length; j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}
